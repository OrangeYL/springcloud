package com.orange.springcloud.controller;

import com.orange.springcloud.pojo.Dept;
import com.orange.springcloud.service.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class DeptController {
    @Autowired
    private DeptClientService deptClientService;

    @RequestMapping("/consumer/dept/get/{id}")
    public Dept get(@PathVariable("id")Long id){

        return this.deptClientService.queryById(id);
    }

    @RequestMapping("/consumer/dept/list")
    public List<Dept> getAll(){
        return this.deptClientService.queryAll();
    }

    @RequestMapping("/consumer/dept/add")
    public Boolean add(Dept dept){
        return this.deptClientService.addDept(dept);
    }
}
