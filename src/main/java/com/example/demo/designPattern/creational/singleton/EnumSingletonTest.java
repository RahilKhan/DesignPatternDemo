package com.example.demo.designPattern.creational.singleton;

public class EnumSingletonTest {
    public static void main(String... args) {
        EnumSingleton enumSingleton = EnumSingleton.INSTANCE;
        enumSingleton.test();
    }
}
