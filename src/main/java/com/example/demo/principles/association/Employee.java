package com.example.demo.principles.association;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Employee {

    private String name;

    public Employee(String name) {
        this.name = name;
    }

}
