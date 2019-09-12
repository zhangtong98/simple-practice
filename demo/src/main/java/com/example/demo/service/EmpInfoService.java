package com.example.demo.service;

import com.example.demo.dao.EmpInfoDao;
import com.example.demo.entities.DeptInfoEntity;
import com.example.demo.entities.DeptpostInfoEntity;
import com.example.demo.entities.EmpInfoEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class EmpInfoService {

    @Autowired
    private EmpInfoDao empInfoDao;

    @Autowired
    private DeptInfoService deptInfoService;

    @Autowired
    private DeptpostInfoService deptpostInfoService;

    public Integer save(EmpInfoEntity empInfoEntity){
        return empInfoDao.save(empInfoEntity);
    }


    public String delete(Integer id){
        Integer rows = empInfoDao.delete(id);
        if (rows != 1) {
            return "/statupage/error";
        }
        return "/statupage/success";
    }

    public Integer update(EmpInfoEntity empInfoEntity){
        return empInfoDao.update(empInfoEntity);
    }

    public String select(Model model){
        try {
            model.addAttribute("contents",empInfoDao.selectAll());
            return "/empinfo/emplist";
        }catch (RuntimeException e){
            return "/statupage/error";
        }
    }

    public String selectById(Integer id, Model model){

        EmpInfoEntity emp = empInfoDao.selectById(id);

        String dateStr = new SimpleDateFormat("yyyy-MM-dd").format(emp.getEmpDate());
        emp.setDateStr(dateStr);

        List<DeptInfoEntity> depts = deptInfoService.selectAll();
        List<DeptpostInfoEntity> deptposts = deptpostInfoService.selectAll();
        if(emp == null || depts.isEmpty() || deptposts.isEmpty()) {
            return "/statupage/error";
        }
        model.addAttribute("deptposts",deptposts);
        model.addAttribute("depts",depts);
        model.addAttribute("empinfo" , emp);
        return "/empinfo/empsave";
    }

    public String updateOrSave(EmpInfoEntity empInfoEntity){
        if(StringUtils.isEmpty(empInfoEntity.getEmpNo()) || StringUtils.isEmpty(empInfoEntity.getEmpName())){
            return "/statupage/error";
        }

        try{
            empInfoEntity.setEmpDate(new SimpleDateFormat("yyyy-MM-dd").parse(empInfoEntity.getDateStr()));
        }catch (ParseException e){
            return "/statupage/error";
        }

        Integer rows;
        if(empInfoEntity.getEmpId()==null) {
            rows = save(empInfoEntity);
        } else {
            rows = update(empInfoEntity);
        }

        if (rows != 1 ){
            return "/statupage/error";
        }
        return "/statupage/success";
    }

    public String form(Model model){

        List<DeptInfoEntity> depts = deptInfoService.selectAll();
        List<DeptpostInfoEntity> deptposts = deptpostInfoService.selectAll();
        if(depts.isEmpty()|| deptposts.isEmpty()) {
            return "/statupage/error";
        }
        model.addAttribute("deptposts",deptposts);
        model.addAttribute("depts",depts);
        model.addAttribute("empinfo" , new EmpInfoEntity());
        return "/empinfo/empsave";
    }

}
