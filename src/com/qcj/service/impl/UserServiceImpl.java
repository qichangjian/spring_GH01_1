package com.qcj.service.impl;

import com.qcj.dao.UserDao;
import com.qcj.service.UserService;

public class UserServiceImpl implements UserService {
    UserDao userDao;

    //set方式+接口
    /*public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }*/

    //构造器方式
    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void addUser() {
        userDao.addUser();
    }

    @Override
    public void deleteUser() {
        userDao.deleteUser();
    }
}
