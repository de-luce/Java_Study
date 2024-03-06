package com.deluce.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RestFulController {

    //原先       ：http://localhost:8080/springMVC_04_controller/add?a=1&b=2
    //RestFul   : http://localhost:8080/springMVC_04_controller/add/a/b

    //@RequestMapping(value = "/add/{a}/{b}", method = RequestMethod.DELETE)
    @PostMapping(value = "/add/{a}/{b}")
    public String test1(@PathVariable int a, @PathVariable int b, Model model) {
        int res = a + b;
        model.addAttribute("msg", "结果1为" + res);
        return "test";

    }

    @GetMapping(value = "/add/{a}/{b}")
    public String test2(@PathVariable int a, @PathVariable int b, Model model) {
        int res = a + b;
        model.addAttribute("msg", "结果2为" + res);
        return "test";

    }
}
