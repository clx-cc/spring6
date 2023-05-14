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
public class SecurityLogAspect {

    @Pointcut("execution(* com.cao.spring6.biz..save*(..))")
    public void deletePointcut(){}
    @Pointcut("execution(* com.cao.spring6.biz..delete*(..))")
    public void modifyPointcut(){}
    @Pointcut("execution(* com.cao.spring6.biz..modify*(..))")
    public void savePointcut(){}




    @Before("savePointcut() || deletePointcut() || modifyPointcut()")
    public void beforeAdvice(JoinPoint joinPoint){
        //打印日志信息，什么时间，谁，做了什么事情
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        String time = sdf.format(new Date());
        System.out.println(time + "张三：" + joinPoint.getSignature().getDeclaringTypeName() + "." + joinPoint.getSignature().getName());
    }
}
