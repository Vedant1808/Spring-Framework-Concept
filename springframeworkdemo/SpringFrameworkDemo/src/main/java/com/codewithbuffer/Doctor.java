package com.codewithbuffer;

import org.springframework.stereotype.Component;

//@Component
public class Doctor implements Staff{

    private String name;


    private SeniorDoctor seniorDoctor;

    public void assist()
    {
        System.out.println("Doctor is assisting");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SeniorDoctor getSeniorDoctor() {
        return seniorDoctor;
    }

    public void setSeniorDoctor(SeniorDoctor seniorDoctor) {
        this.seniorDoctor = seniorDoctor;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "name='" + name + '\'' +
                ", seniorDoctor=" + seniorDoctor +
                '}';
    }

    public Doctor() {
    }

    public Doctor(String name, SeniorDoctor seniorDoctor) {
        this.name = name;
        this.seniorDoctor = seniorDoctor;
    }

    public Doctor(String name) {
        this.name = name;
    }
}
