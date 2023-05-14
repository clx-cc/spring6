package com.cao.proxy.service;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class TimerMethodInterceptor implements MethodInterceptor {
    @Override
    public Object intercept(Object target, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {

        //调用目标前增强
        long begin = System.currentTimeMillis();
        //执行目标
        Object retValue = methodProxy.invokeSuper(target, objects);
        //调用目标后增强
        long end = System.currentTimeMillis();
        System.out.println("耗时"+(end - begin)+"毫秒");
        //返回值
        return retValue;
    }
}
