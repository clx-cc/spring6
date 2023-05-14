package com.cao.spring6.service;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1)
public class TransactionAspect {

    //编程式事务解决方案
    @Around("execution(* com.cao.spring6.service..*(..))")
    public void aroundAdvice(ProceedingJoinPoint joinPoint){


        try {
            //前环绕
            System.out.println("开启事务");
            //执行目标
            joinPoint.proceed();
            //后环绕：出现异常就不会提交了
            System.out.println("提交事务");
        } catch (Throwable e) {
            //后环绕：出现异常回滚事务
            System.out.println("回滚事务");
        }
    }
}
