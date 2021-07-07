package com.gjw.springbootdemo.controller;

import com.gjw.springbootdemo.bean.Department;
import com.gjw.springbootdemo.bean.Employ;
import com.gjw.springbootdemo.mapper.DepartmentMapper;
import com.gjw.springbootdemo.mapper.EmployMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Collection;

@Controller
public class EmployController {

    @Autowired
    EmployMapper employMapper;

    @Autowired
    DepartmentMapper departmentMapper;

    @RequestMapping("emp")
    public String list(Model model) {
        Collection<Employ> all = employMapper.getAll();
        model.addAttribute("all", all);
        return "list";
    }

    @GetMapping("toAdd")
    public String toAdd(Model model){
        Collection<Department> allDept = departmentMapper.getAllDept();
        model.addAttribute("allDept",allDept);
        return "add";
    }

    @PostMapping("toAdd")
    public String addEmp(Employ employ){
        System.out.println(employ);
        employMapper.add(employ);
        return "redirect:/emp";
    }

    @GetMapping("toUpdEmp/{eID}")
    public String toUpdEmp(@PathVariable("eID") Integer eID,Model model){
        Employ employByID = employMapper.getEmployByID(eID);
        Collection<Department> allDept = departmentMapper.getAllDept();
        model.addAttribute("allDept",allDept);
        model.addAttribute("emp",employByID);
        return "update";
    }

    @PostMapping("/updEmp")
    public String updEmp(Employ employ){
        employMapper.add(employ);
        return "redirect:emp";
    }

    @GetMapping("toDelEmp/{eID}")
    public String toDelEmp(@PathVariable("eID") Integer eID){
        employMapper.deleteByID(eID);
        return "redirect:/emp";
    }


}
