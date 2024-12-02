package com.codewithbuffer;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.springframework.stereotype.Component;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Aspect;

@Component
@Aspect
public class Logging {

    // whenever checkout() is called, before it is called we want loggers is called
    @Before("execution(* com.codewithbuffer.ShoppingCart.checkout())")
    public void beforeLogger(JoinPoint jp)
    {
        System.out.println(jp.getSignature());
        System.out.println("before loggers");
    }

    @After("execution(* *.*.checkout())")
    public void afterLogger()
    {
        System.out.println("after loggers");
    }

}
