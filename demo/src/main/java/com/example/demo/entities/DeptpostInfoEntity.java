package com.example.demo.entities;

import java.io.Serializable;

/**
 * @program: demo
 * @description: 岗位
 * @author: zhangtong
 * @create: 2019-09-10 21:15
 **/
public class DeptpostInfoEntity implements Serializable {

    //编号
    private Integer deptpostId;
    //岗位名称
    private String  deptpostName;
    //部门ID
    private Integer deptId;


    @Override
    public String toString() {
        return "DeptpostInfoEntity{" +
                "deptpostId=" + deptpostId +
                ", deptpostName='" + deptpostName + '\'' +
                ", deptId=" + deptId +
                '}';
    }

    public Integer getDeptpostId() {
        return deptpostId;
    }

    public void setDeptpostId(Integer deptpostId) {
        this.deptpostId = deptpostId;
    }

    public String getDeptpostName() {
        return deptpostName;
    }

    public void setDeptpostName(String deptpostName) {
        this.deptpostName = deptpostName;
    }

    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }
}
