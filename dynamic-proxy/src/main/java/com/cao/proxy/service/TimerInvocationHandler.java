package com.cao.proxy.service;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class TimerInvocationHandler implements InvocationHandler {
    private Object target;

    public TimerInvocationHandler(Object target) {
        this.target = target;
    }

    /*
        1.为什么必须要实现invocationHandler接口
            因为实现接口必定要实现接口中的方法，而这个接口中的invoke()方法，JDK在底层已经写好了调用这个方法的逻辑。
            所以JDK要求你必须实现这个接口，才会有invoke方法
            注意：invoke()方法不是程序员调用的，是JDK负责调用的。
        2.invoke()方法什么时候调用？
            当代理对象调用代理方法的时候，注册在InvocationHandler调用处理器中的invoke()方法被调用。
        3.invoke()方法的三个参数
            invoke()方法是JDK负责调用的，所以JDK调用这个方法的时候，会自动给我们传递三个参数。
            第一个参数：Object proxy 代理对象的引用。使用较少
            第二个参数：Method method 目标对象调用的目标方法。
            第三个参数：Object[] args 目标方法上的参数

         invoke在执行的过程中，使用method来调用目标对象的目标方法

     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        long begin = System.currentTimeMillis();
        //通过反射机制调用目标对象上的目标方法
        Object retValue = method.invoke(target, args);
        long end = System.currentTimeMillis();
        System.out.println("耗时"+(end - begin)+"毫秒");
        return retValue;//方法的返回值
    }
}
