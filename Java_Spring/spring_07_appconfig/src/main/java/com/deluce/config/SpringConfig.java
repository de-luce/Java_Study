package com.deluce.config;

import com.deluce.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.deluce.pojo")
public class SpringConfig {

    //注册bean相当于bean标签
    //id 方法名字   class 方法返回值
    @Bean
    public User getUser(){
        return new User();
    }

}
