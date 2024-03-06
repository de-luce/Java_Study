package com.deluce.controller;

import com.deluce.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {

    @GetMapping("/t1")
    public String test(String name, Model model) {
        //1.接收前端
        System.out.println("接收参数为" + name);

        //2.返回结果到前端
        model.addAttribute("msg", "hello " + name);

        ///3.跳转视图
        return "test";
    }

    //前端提交对象    id,name,age
    /*
    1.接受前端传递参数，判断参数名，若匹配直接使用
    2.若传递对象User，匹配User对象中字段，若匹配直接使用
    */
    @GetMapping("/t2")
    public String test2(User user) {
        System.out.println(user);
        return "test";
    }

    @GetMapping("/t3")
    public String test3(ModelMap modelMap){
        modelMap.addAttribute("msg", "hello");
        return "test";
    }
}
