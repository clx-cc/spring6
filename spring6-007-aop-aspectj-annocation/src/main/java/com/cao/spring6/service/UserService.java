package com.cao.spring6.service;

import org.springframework.stereotype.Service;

@Service("userService")
public class UserService {//目标类

    public void login(){//目标方法
        System.out.println("系统正在进行登录谁~");
    }

    public void logout(){
        System.out.println("退出系统");
    }
}
