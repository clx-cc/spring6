package com.cao.spring6.service;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1)//切面的执行顺序，数字越小就先执行
public class SecurityAspect {//安全切面

    //调用别的切面的切点表达式
    @Before("com.cao.spring6.service.LogAspect.myPointcut()")
    public void beforeAdvice(){
        System.out.println("安全前置通知");

    }

}
