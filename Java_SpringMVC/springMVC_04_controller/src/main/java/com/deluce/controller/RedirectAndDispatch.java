package com.deluce.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RedirectAndDispatch {
    @RequestMapping("/rad/t1")
    public String test1(Model model){
        model.addAttribute("msg","test1");
        //转发一
        return "/test.jsp";
    }

    @RequestMapping("/rad/t2")
    public String test2(Model model){
        model.addAttribute("msg","test2");
        //转发二
        return "forward:/test.jsp";
    }

    @RequestMapping("/rad/t3")
    public String test3(Model model){
        model.addAttribute("msg","test3");
        //重定向
        return "redirect:/test.jsp";
    }
}
