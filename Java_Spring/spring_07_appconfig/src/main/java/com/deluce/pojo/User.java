package com.deluce.pojo;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

@Data
@Component
public class User {
    @Value("deluce")
    private String name;
}
