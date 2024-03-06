package com.deluce.pojo;

import lombok.Data;

import java.util.*;

@Data
public class Student {
    private String name;
    private Address address;
    private String[] books;
    private List<String> hobbies;
    private Map<String,String> card;
    private Set<String> games;
    private String wife;
    private Properties info;

    @Override
    public String toString() {
        return "Student{" + "name='" + name + '\'' + ", address=" + address.toString() + ", books=" + Arrays.toString(books) + ", hobbies=" + hobbies + ", card=" + card + ", games=" + games + ", wife='" + wife + '\'' + ", info=" + info + '}';
    }
}
