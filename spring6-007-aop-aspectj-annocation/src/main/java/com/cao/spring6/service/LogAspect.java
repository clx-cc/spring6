package com.cao.spring6.service;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component("logAspect")
@Aspect
@Order(2)
public class LogAspect {//切面


    //切面 = 通知 + 切点

    //通用切点表达式
    @Pointcut("execution(* com.cao.spring6.service..*(..))")
    public void myPointcut(){
        //
    }
    //前置通知
    @Before("myPointcut()")
    public void beforeAdvice(){
        System.out.println("我是一个前置通知！");
    }

    //后置通知
    @AfterReturning("myPointcut()")
    public void afterReturningAdvice(){
        System.out.println("我是一个后置通知！");

    }

    //环线通知：是最大的通知，在前置前，在后置之后
    @Around("execution(* com.cao.spring6.service..*(..))")
    public void aroundAdvice(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("我是一个前置环绕通知！");
        joinPoint.proceed();
        System.out.println("我是一个后置环绕通知！");
    }

    //异常通知：没有异常就没有异常通知
    @AfterThrowing("execution(* com.cao.spring6.service..*(..))")
    public void afterThrowingAdvice(){
        System.out.println("异常通知");
    }

    //最终通知
    @After("myPointcut()")
    public void afterAdvice(){
        System.out.println("最终通知");
    }



}
