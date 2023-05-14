package com.cao.proxy.client;

import com.cao.proxy.service.TimerMethodInterceptor;
import com.cao.proxy.service.UserService;
import net.sf.cglib.proxy.Enhancer;

public class CglibClient {
    public static void main(String[] args) {

        //创建字节码增强器
        Enhancer enhancer = new Enhancer();
        //告诉CGLIB要继承哪个类
        enhancer.setSuperclass(UserService.class);
        //设置回调接口
        enhancer.setCallback(new TimerMethodInterceptor());
        //生成源码，编译class,加载到JVM，并创建代理对象
        UserService userServiceProxy = (UserService) enhancer.create();

        userServiceProxy.login();
        userServiceProxy.logout();
    }
}
