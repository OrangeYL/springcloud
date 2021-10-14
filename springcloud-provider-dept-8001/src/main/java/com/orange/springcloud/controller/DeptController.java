package com.orange.springcloud.controller;


import com.orange.springcloud.pojo.Dept;
import com.orange.springcloud.service.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DeptController {

    @Autowired
    private DeptClientService deptService;

    @Autowired
    private DiscoveryClient discoveryClient;

    @PostMapping("/dept/add")
    public Boolean addDept(Dept dept){
        return deptService.addDept(dept);
    }

    @GetMapping("/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id){
        return deptService.queryById(id);
    }

    @GetMapping("/dept/list")
    public List<Dept> queryAll(){
        return deptService.queryAll();
    }

    @GetMapping("/dept/discovery")
    public Object discovery(){
        List<String> services = discoveryClient.getServices();
        System.out.println("discovery=>services:" + services);
        List<ServiceInstance> instances = discoveryClient.getInstances("SPRINGCLOUD-PROVIDER-DEPT");
        for(ServiceInstance instance:instances){
            System.out.println( instance.getHost() + "\t" + // 主机名称
                    instance.getPort() + "\t" + // 端口号
                    instance.getUri() + "\t" + // uri
                    instance.getServiceId() // 服务id
            );
        }
        return this.discoveryClient;
    }
}
