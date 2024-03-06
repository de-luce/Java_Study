package com.deluce.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController_02 {

    @RequestMapping("/t2")
    public String test2(Model model) {
        model.addAttribute("msg", "test2");
        return "test";
    }
}
