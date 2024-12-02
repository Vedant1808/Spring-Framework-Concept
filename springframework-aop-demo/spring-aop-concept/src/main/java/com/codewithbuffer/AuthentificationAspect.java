package com.codewithbuffer;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AuthentificationAspect
{

    // this method is executed for all methods with com.codewithbuffer methods
    @Pointcut("within(com.codewithbuffer..)")
    public void authentificationPointCut()
    {}

    // this method is executed for all methods within shopping cart class
    @Pointcut("within(com.codewithbuffer..)")
    public void authorizationPointCut()
    {}

    @Before("authentificationPointCut && authorizationPointCut")
    public void authenticate()
    {
        System.out.println("Authenticating the request");
    }
}
