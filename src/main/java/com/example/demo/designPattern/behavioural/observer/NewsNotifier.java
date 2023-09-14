package com.example.demo.designPattern.behavioural.observer;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

@Slf4j
public class NewsNotifier implements Notifier {

    private String notification;
    private List<Subscriber> subscribers = new ArrayList<>();

    public void addSubscriber(Subscriber subscriber) {
        this.subscribers.add(subscriber);
    }

    public void removeSubscriber(Subscriber subscriber) {
        this.subscribers.remove(subscriber);
    }

    public void updateSubscribers(String notification) {
        this.notification = notification;
        for (Subscriber subscriber : subscribers) {
            subscriber.update(this.notification);
        }
    }

}
