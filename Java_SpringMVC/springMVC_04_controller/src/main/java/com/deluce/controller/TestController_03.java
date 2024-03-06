package com.deluce.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("TC03")
public class TestController_03 {
    @RequestMapping("/t2")
    public String test1(Model model){
        model.addAttribute("msg", "test3");
        return "test";
    }
}
