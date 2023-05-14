package com.cao.spring6.service;

import com.cao.spring6.dao.UserDao;

public class UserService {
    //使用set注入的方式给userDao注入对象：这个属性必须有set方法。
    private UserDao userDao;

    //使用set方法注入，必须提花set方法
    //反射机制要调用set方法给userDao这个属性赋值
    //这个set方法的名字没有要求，但是必须以“set”开始，后面可以随便写，但是最好是写属性名。

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void save(){
        userDao.insert();
    }
}
