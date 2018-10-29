package com.qcj.test;

import com.qcj.dao.UserDao;
import com.qcj.dao.impl.UserDaoImpl;
import com.qcj.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        //                   原来的创建方式
        /*UserDao dao = new UserDaoImpl();
        dao.addUser();
        dao.deleteUser();*/

        //                    spring方式
       /* //1.加载配置文件，获取容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("com/qcj/config/applicationContext.xml");
        //2.从容器中获取对象
        //Object userDao = ac.getBean("userDao");//一个参数返回object
        UserDao userDao = ac.getBean("userDao",UserDao.class);//两个参数返回 第二个参数类型
        userDao.addUser();
        userDao.deleteUser();*/

        //               service接口引用
        //1.加载配置文件，获取容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("com/qcj/config/applicationContext.xml");
        //2.从容器中获取对象
        //Object userDao = ac.getBean("userDao");//一个参数返回object
        UserService userService = ac.getBean("userService", UserService.class);//两个参数返回 第二个参数类型
        userService.addUser();
        userService.deleteUser();
    }
}
