package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Setter
@Getter
public class MenuItem {
    String name;
    String description;
    Boolean vegetarian;
    double price;
}
