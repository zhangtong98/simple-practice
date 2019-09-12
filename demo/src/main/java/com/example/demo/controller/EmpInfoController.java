package com.example.demo.controller;

import com.example.demo.entities.EmpInfoEntity;
import com.example.demo.service.DeptInfoService;
import com.example.demo.service.EmpInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class EmpInfoController {

    @Autowired
    private EmpInfoService empInfoService;

    @RequestMapping(value = "/save", method = {RequestMethod.POST, RequestMethod.GET})
    public String save(EmpInfoEntity empInfoEntity){
        return empInfoService.updateOrSave(empInfoEntity);
    }


    @RequestMapping(value = "/delete/{id}", method = {RequestMethod.POST, RequestMethod.GET})
    public String delete(@PathVariable("id")Integer id){
        return empInfoService.delete(id);
    }

    @RequestMapping(value = "/", method = {RequestMethod.POST, RequestMethod.GET})
    public String select(Model model){
        return empInfoService.select(model);
    }

    @RequestMapping(value = "/edit/{id}", method = {RequestMethod.POST, RequestMethod.GET})
    public String editForm(@PathVariable("id") Integer id , Model model){
        return empInfoService.selectById(id,model);
    }


    @RequestMapping(value = "/form", method = {RequestMethod.POST, RequestMethod.GET})
    public String form(Model model){
        return empInfoService.form(model);
    }

}
