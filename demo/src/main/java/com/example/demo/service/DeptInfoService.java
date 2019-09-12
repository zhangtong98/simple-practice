package com.example.demo.service;

import com.example.demo.dao.DeptInfoDao;
import com.example.demo.entities.DeptInfoEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: demo
 * @description: 部门
 * @author: zhangtong
 * @create: 2019-09-10 21:30
 **/
@Service
public class DeptInfoService {

    @Autowired
    private DeptInfoDao deptInfoDao;

    public List<DeptInfoEntity> selectAll(){
        List<DeptInfoEntity> list = deptInfoDao.selectAll();
        return list;
    }

}
