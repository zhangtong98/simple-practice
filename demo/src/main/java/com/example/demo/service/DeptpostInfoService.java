package com.example.demo.service;

import com.example.demo.dao.DeptpostInfoDao;
import com.example.demo.entities.DeptpostInfoEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: demo
 * @description: 岗位
 * @author: zhangtong
 * @create: 2019-09-10 21:25
 **/
@Service
public class DeptpostInfoService {

    @Autowired
    private DeptpostInfoDao deptpostInfoDao;

    public List<DeptpostInfoEntity> selectAll(){
        return deptpostInfoDao.selectAll();
    }

}
