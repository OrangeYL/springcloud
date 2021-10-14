package com.orange.springcloud.service.impl;

import com.orange.springcloud.dao.DeptDao;
import com.orange.springcloud.pojo.Dept;
import com.orange.springcloud.service.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DeptServiceImpl implements DeptClientService {

    @Autowired
    private DeptDao deptDao;
    @Override
    public Boolean addDept(Dept dept) {
        return deptDao.addDept(dept);
    }

    @Override
    public Dept queryById(Long id) {
        return deptDao.queryById(id);
    }

    @Override
    public List<Dept> queryAll() {
        return deptDao.queryAll();
    }
}
