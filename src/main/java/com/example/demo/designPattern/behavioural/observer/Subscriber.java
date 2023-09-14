package com.example.demo.designPattern.behavioural.observer;

public interface Subscriber {
    public void update(String notification);

    public void printNews();
}
