package com.example.demo.designPattern.behavioural.observer.headfirst.normal;

public interface Subject {
    public void registerObserver(Observer o);

    public void removeObserver(Observer o);

    public void notifyObservers();
}
