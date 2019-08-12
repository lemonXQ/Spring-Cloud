package com.tit.springcloud.service;

import java.util.List;

import com.tit.springcloud.entity.Dept;

public interface DeptService {

    boolean addDept(Dept dept);

    Dept findById(Long id);

    List<Dept> findAll();
}
