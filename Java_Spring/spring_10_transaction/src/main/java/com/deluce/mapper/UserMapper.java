package com.deluce.mapper;

import com.deluce.pojo.User;

import java.util.List;

public interface UserMapper {
    public List<User> selectUser();

    //添加一个用户
    public int insertUser(User user);

    //删除一个用户
    public int deleteUser(int id);
}
