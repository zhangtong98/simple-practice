package com.example.demo.dao;

import com.example.demo.entities.EmpInfoEntity;

import java.util.List;

public interface EmpInfoDao {

    Integer save(EmpInfoEntity person);

    Integer delete(Integer id);

    Integer update(EmpInfoEntity person);

    EmpInfoEntity selectById(Integer id);

    List<EmpInfoEntity> selectAll();

}
