package com.example.demo.entities;

import java.io.Serializable;

/**
 * @program: demo
 * @description: 部门
 * @author: zhangtong
 * @create: 2019-09-10 21:10
 **/
public class DeptInfoEntity implements Serializable {

    //编号
    private Integer deptId;
    //部门名称
    private String deptName;

    @Override
    public String toString() {
        return "DeptInfoEntity{" +
                "deptId=" + deptId +
                ", deptName='" + deptName + '\'' +
                '}';
    }

    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }
}
