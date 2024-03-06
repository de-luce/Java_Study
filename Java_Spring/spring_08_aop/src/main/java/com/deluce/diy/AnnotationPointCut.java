package com.deluce.diy;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

//使用注解实现AOP
//标注切面
@Aspect
public class AnnotationPointCut {
    @Before("execution(* com.deluce.service.UserServiceImpl.*(..))")
    void before() {
        System.out.println("before");
    }

    @After("execution(* com.deluce.service.UserServiceImpl.*(..))")
    void after() {
        System.out.println("after");
    }

    //环绕增强中，指定一个参数，代表要获取处理切入的点
    @Around("execution(* com.deluce.service.UserServiceImpl.*(..))")
    void around(ProceedingJoinPoint point) throws Throwable {
        System.out.println("环绕前");
        Signature signature = point.getSignature();
        System.out.println("signature"+signature);
        //执行方法
        Object proceed = point.proceed();
        System.out.println("环绕后");
    }
}
