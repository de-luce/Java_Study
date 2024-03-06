package com.deluce.service;

import com.deluce.dao.UserDao;

public class UserServiceImpl implements UserService {
    private UserDao userDao;

    //利用set动态注入
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void getUser() {
        userDao.getUser();
    }
}
