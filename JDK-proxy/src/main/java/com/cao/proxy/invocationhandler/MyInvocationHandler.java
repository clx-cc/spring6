package com.cao.proxy.invocationhandler;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyInvocationHandler implements InvocationHandler {
    Object target;

    //通过构造方法获得目标对象
    public MyInvocationHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        /**
         * 与我们的静态代理一样，我们需要一个目标对象来执行目标对象的目标方法。
         * proxy是代理对象
         * method是目标方法
         */
        long begin = System.currentTimeMillis();
        //执行目标对象的目标方法
        Object res = method.invoke(target, args);
        long end = System.currentTimeMillis();
        System.out.println("耗时"+(end - begin)+"毫秒");
        return res;//返回的是目标方法的返回值
    }
}
