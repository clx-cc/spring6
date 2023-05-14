package com.cao.spring6.biz;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component
@Aspect
public class LogAspect {//切面

    //切点
    @Pointcut("execution(* com.cao.spring6.biz..safe*(..))")
    public void safePointcut(){}
    @Pointcut("execution(* com.cao.spring6.biz..delete*(..))")
    public void deletePointcut(){}
    @Pointcut("execution(* com.cao.spring6.biz..modify*(..))")
    public void modifyPointcut(){}
    @Pointcut("execution(* com.cao.spring6.biz..get*(..))")
    public void getPointcut(){}


    @Before("safePointcut() || deletePointcut() || modifyPointcut() || getPointcut()")
    public void beforeAdvice(JoinPoint joinPoint){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        String nowTime = sdf.format(new Date());
        System.out.println(nowTime + " :clx操作了" + joinPoint.getSignature().getDeclaringTypeName() + "." + joinPoint.getSignature().getName() );

    }
}
