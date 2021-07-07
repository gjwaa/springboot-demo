package com.gjw.springbootdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("user")
public class LoginController {

    @RequestMapping("/login")
    public String login(@RequestParam("acc") String acc, @RequestParam("pwd") String pwd, Model model, HttpSession session) {

        if (!acc.isEmpty() && !pwd.isEmpty()) {
            model.addAttribute("msg", acc);
            session.setAttribute("loginUser",acc);
            return "redirect:/main.html";
        } else {
            model.addAttribute("msg", "错误");
            return "index";
        }

    }

    @RequestMapping("/loginOut")
    public String loginOut(HttpSession session){
        session.invalidate();
        return "redirect:index.html";
    }


}
