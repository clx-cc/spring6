package com.cao.spring6.service;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@org.aspectj.lang.annotation.Aspect
@Order(2)
public class Aspect {

    @Pointcut("execution(* com.cao.spring6.service..*(..))")
    public void myPointcut(){}

    @Around("myPointcut()")
    public void aroundAdvice(ProceedingJoinPoint joinPoint){

        try {
            System.out.println("今天的开启");
            joinPoint.proceed();
            System.out.println("今天的提交");
        } catch (Throwable e) {
            System.out.println("今天的回滚");
        }


    }
}
