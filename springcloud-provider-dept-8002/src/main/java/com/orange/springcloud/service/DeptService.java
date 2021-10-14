package com.orange.springcloud.service;

import com.orange.springcloud.pojo.Dept;

import java.util.List;


public interface DeptService {
    public boolean addDept(Dept dept);
    public Dept queryById(Long id);
    public List<Dept> queryAll();
}
