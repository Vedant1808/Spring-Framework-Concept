package com.codewithbuffer;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Nurse implements Staff{

    @Value("500000")
    private String salary;
    public Nurse()
    {
        this.salary="";
    }
    public Nurse(String salary)
    {
        this.salary=salary;
    }
    public void setSalary(String salary)
    {
        this.salary=salary;
    }
    public String getSalary()
    {
        return this.salary;
    }
    public void assist()
    {
        System.out.println("Nurse is assisting");
    }


    @PostConstruct
    public void happy()
    {
        System.out.println("Init method of nurse is called");
    }

    @PreDestroy
    public void sad()
    {
        System.out.println("Destroy method of nurse is called");
    }

    @Override
    public String toString() {
        return "Nurse{" +
                "salary='" + salary + '\'' +
                '}';
    }
}
