package com.codewithbuffer;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = "com.codewithbuffer")
@EnableAspectJAutoProxy
public class BeanConfig {


}
