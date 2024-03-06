package com.deluce.controller;

import com.deluce.pojo.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@RestController
public class AjaxController {

    @RequestMapping("/t1")
    public String test1() {
        return "hello";
    }

    @RequestMapping("/a1")
    public void test2(String name, HttpServletResponse response) throws IOException {
        System.out.println("a1:==>" + name);
        if ("deluce".equals(name)) {
            response.getWriter().write("hello");
        } else {
            response.getWriter().write("error");
        }
    }

    @RequestMapping("/a2")
    public List<User> test3() {
        List<User> userList = new ArrayList<>();
        userList.add(new User("deluce1", 21, "男"));
        userList.add(new User("deluce2", 21, "男"));
        userList.add(new User("deluce3", 21, "男"));

        return userList;
    }

    @RequestMapping("/a3")
    public String login(String name, String pwd) {
        String msg = "";
        if (name != null) {
            if ("admin".equals(name)) {
                msg = "ok";
            }else {
                msg = "error";
            }
        }
        return msg;
    }
}
