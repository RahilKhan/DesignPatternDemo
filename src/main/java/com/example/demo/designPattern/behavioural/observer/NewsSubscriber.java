package com.example.demo.designPattern.behavioural.observer;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Getter
@Setter
public class NewsSubscriber implements Subscriber{

    public String notification;

    public void update(String notification) {
        this.setNotification(notification);
    }

    public void printNews(){
      log.info("NewsSubscriber -> {}", this.getNotification());
    }

}
