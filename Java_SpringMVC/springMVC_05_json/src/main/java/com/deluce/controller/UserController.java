package com.deluce.controller;

import com.alibaba.fastjson2.JSON;
import com.deluce.pojo.User;
import com.deluce.utils.JsonUtils;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

//@Controller+@ResponseBody
@RestController
public class UserController {

    @RequestMapping("/j1")
    //不走视图解析器,会直接返回字符串
    public String json1() throws JsonProcessingException {
        //jackson
        ObjectMapper mapper = new ObjectMapper();

        //创建对象
        User user = new User("deluce", 20, "男");

        String str = mapper.writeValueAsString(user);

        return str;
    }

    @RequestMapping("/j2")
    public String json2() throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();

        List<User> users = new ArrayList<>();

        User user1 = new User("deluce1", 20, "男");
        User user2 = new User("deluce2", 20, "男");
        User user3 = new User("deluce3", 20, "男");
        User user4 = new User("deluce4", 20, "男");

        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);

        return mapper.writeValueAsString(users);
    }

    @RequestMapping("/j3")
    public String json3() throws JsonProcessingException {
        Date date = new Date();
        return JsonUtils.toJson(date);
    }

    @RequestMapping("/j4")
    public String json4(){
        List<User> userList = new ArrayList<>();
        User user1 = new User("deluce1", 20, "男");
        User user2 = new User("deluce2", 20, "男");
        User user3 = new User("deluce3", 20, "男");
        User user4 = new User("deluce4", 20, "男");
        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
        userList.add(user4);

        return JSON.toJSONString(userList);
    }

}
