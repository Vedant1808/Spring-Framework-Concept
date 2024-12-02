package com.codewithbuffer;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan(basePackages = "com.codewithbuffer")
public class BeanConfig {

    @Bean
    public Doctor doctor()
    {
        Doctor d=new Doctor();
        d.setName("Abhishek");
        d.setSeniorDoctor(seniorDoctor());
        return d;
    }
    @Bean(name="d1")
    @Scope("prototype")
    public Doctor doctor1()
    {
        Doctor d=new Doctor();
        d.setName("Amit");
        d.setSeniorDoctor(seniorDoctor());
        return d;
    }

    @Bean
    public SeniorDoctor seniorDoctor()
    {
        return new SeniorDoctor("MBBS");
    }


}
