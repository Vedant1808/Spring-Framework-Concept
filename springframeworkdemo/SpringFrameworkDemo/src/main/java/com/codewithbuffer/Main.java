package com.codewithbuffer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.print.Doc;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");//TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
////        // to see how IntelliJ IDEA suggests fixing it.
////        Doctor d=context.getBean(Doctor.class);
////        d.assist();
//        Staff staff=context.getBean(Nurse.class);
//        staff.assist();
//
//        Doctor staff1=context.getBean(Doctor.class);
//        staff1.assist();
//        System.out.println(staff1.getName());
//        System.out.println(staff1.getSeniorDoctor().getType());

        ApplicationContext context=new AnnotationConfigApplicationContext(BeanConfig.class);
        Staff doctor=(Doctor)context.getBean("doctor");
        System.out.println(doctor);
        doctor=(Doctor)context.getBean("d1");
        System.out.println(doctor);

        Staff nurse=context.getBean(Nurse.class);
        System.out.println(nurse);



    }
}