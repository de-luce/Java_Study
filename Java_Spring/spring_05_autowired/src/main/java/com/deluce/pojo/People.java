package com.deluce.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

@lombok.Data
public class People {

    //byName：自动在容器上下文查找和自己对象set方法相对应的bean_id
    @Autowired
    //指定唯一bean对象
    @Qualifier(value = "cat")
    private Cat cat;
    @Autowired
    private Dog dog;

    private String name;
}
