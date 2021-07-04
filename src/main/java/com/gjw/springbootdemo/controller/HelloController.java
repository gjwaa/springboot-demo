package com.gjw.springbootdemo.controller;

import com.gjw.springbootdemo.bean.Dog;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import java.util.Arrays;

@Controller
//@RequestMapping("/index")
public class HelloController {

    @RequestMapping("/login")
    public String index(Model model) {
        model.addAttribute("msg", "hello-Thymeleaf");
        model.addAttribute("item", "这是item");
        model.addAttribute("lists", Arrays.asList("gjw", "yxn"));
        return "login";
    }


}
