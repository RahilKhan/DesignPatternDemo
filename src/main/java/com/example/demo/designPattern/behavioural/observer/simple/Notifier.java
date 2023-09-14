package com.example.demo.designPattern.behavioural.observer.simple;

public interface Notifier {

    public void addSubscriber(Subscriber subscriber);

    public void removeSubscriber(Subscriber subscriber);

    public void updateSubscribers(String notification);

}



