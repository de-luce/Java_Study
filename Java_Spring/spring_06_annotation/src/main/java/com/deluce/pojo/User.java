package com.deluce.pojo;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Data
//等价于 <bean id="user" class="com.deluce.pojo.User"/>
//@Component 组件
@Component
@Scope("prototype")
public class User {
    @Value("deluce")
    public String name;
}
