package com.qcj.dao.impl;

import com.qcj.dao.UserDao;

public class UserDaoImpl2 implements UserDao {
    @Override
    public void addUser() {
        System.out.println("add2");
    }

    @Override
    public void deleteUser() {
        System.out.println("delete2");
    }
}
