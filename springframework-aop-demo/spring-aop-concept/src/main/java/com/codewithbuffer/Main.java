package com.codewithbuffer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ApplicationContext context=new AnnotationConfigApplicationContext(BeanConfig.class);
        ShoppingCart shoppingCart=context.getBean(ShoppingCart.class);
        shoppingCart.checkout();

    }
}