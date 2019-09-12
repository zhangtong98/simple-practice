package com.example.demo.entities;

import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * @program: demo
 * @description: 员工表
 * @author: zhangtong
 * @create: 2019-09-10 21:03
 **/
public class EmpInfoEntity implements Serializable {

    private Integer empId;
    //员工编号
    private String empNo;
    //员工姓名
    private String empName;
    //员工性别
    private Integer empSex;
    //出生年月
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date empDate;

    private String dateStr;

    public String getDateStr() {
        return dateStr;
    }

    public void setDateStr(String dateStr) {
        this.dateStr = dateStr;
    }

    //所属部门id
    private Integer empDeptId;
    //岗位id
    private Integer empDeptpostId;
    //家庭地址
    private String empAddress;
    //部门名称
    private String deptName;

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public String getEmpNo() {
        return empNo;
    }

    public void setEmpNo(String empNo) {
        this.empNo = empNo;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Integer getEmpSex() {
        return empSex;
    }

    public void setEmpSex(Integer empSex) {
        this.empSex = empSex;
    }

    public Date getEmpDate() {
        return empDate;
    }

    public void setEmpDate(Date empDate) {
        this.empDate = empDate;
    }

    public Integer getEmpDeptId() {
        return empDeptId;
    }

    public void setEmpDeptId(Integer empDeptId) {
        this.empDeptId = empDeptId;
    }

    public Integer getEmpDeptpostId() {
        return empDeptpostId;
    }

    public void setEmpDeptpostId(Integer empDeptpostId) {
        this.empDeptpostId = empDeptpostId;
    }

    public String getEmpAddress() {
        return empAddress;
    }

    public void setEmpAddress(String empAddress) {
        this.empAddress = empAddress;
    }

    @Override
    public String toString() {
        return "EmpInfoEntity{" +
                "empId=" + empId +
                ", empNo='" + empNo + '\'' +
                ", empName='" + empName + '\'' +
                ", empSex=" + empSex +
                ", empDate=" + empDate +
                ", empDeptId=" + empDeptId +
                ", empDeptpostId=" + empDeptpostId +
                ", empAddress='" + empAddress + '\'' +
                '}';
    }

}
