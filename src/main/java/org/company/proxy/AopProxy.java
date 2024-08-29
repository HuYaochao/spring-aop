package org.company.proxy;

import org.aspectj.lang.ProceedingJoinPoint;

public class AopProxy {

    public void before(){
        System.out.println("前置增强");
    }

    public void after(){
        System.out.println("后置增强");
    }

    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("环绕增强 - 前置逻辑");

        // 调用目标方法
        Object result = joinPoint.proceed();

        System.out.println("环绕增强 - 后置逻辑");

        // 确保返回值类型与目标方法一致
        return result;
    }
}
