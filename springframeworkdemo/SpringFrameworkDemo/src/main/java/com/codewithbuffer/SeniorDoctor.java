package com.codewithbuffer;

import org.springframework.stereotype.Component;

//@Component
public class SeniorDoctor {
  private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public SeniorDoctor(String type) {
        this.type = type;
    }

    public SeniorDoctor() {
        this.type="";
    }

    @Override
    public String toString() {
        return "SeniorDoctor{" +
                "type='" + type + '\'' +
                '}';
    }
}
