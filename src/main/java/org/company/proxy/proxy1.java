package org.company.proxy;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class proxy1 {
    @Pointcut("execution(* org.company.target.*.*())")
    public void pointCut(){

    }

//    @Before("pointCut()")
    public void before() {
        System.out.println("before....");
    }

//    @After("pointCut()")
    public void after() {
        System.out.println("after....");
    }

    @Around("pointCut()")
    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("before around....");
        pjp.proceed();//继续进行
        System.out.println("after  around....");
        return pjp;
    }

    @AfterReturning(value = "pointCut()")
    public void afterReturning() {
        System.out.println("afterReturning()");
    }

    @AfterThrowing(value = "pointCut()")
    public void afterThrowing() {
        System.out.println("afterThrowing()");
    }
}
