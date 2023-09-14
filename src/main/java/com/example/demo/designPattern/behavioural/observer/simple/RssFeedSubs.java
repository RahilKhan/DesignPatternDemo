package com.example.demo.designPattern.behavioural.observer.simple;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class RssFeedSubs implements Subscriber {

    String rssFeeds;

    @Override
    public void update(String notification) {
        this.rssFeeds = notification;
    }

    @Override
    public void printNews(){
        log.info("   RssFeedSubs    -> {}", this.rssFeeds);
    }

}
