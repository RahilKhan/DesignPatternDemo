package com.example.demo.designPattern.behavioural.observer;

public class ObserverMain {

    public static void main(String... args) {
        Notifier notifier = new NewsNotifier();

        Subscriber newsSubscriber = new NewsSubscriber();
        notifier.addSubscriber(newsSubscriber);

        Subscriber rssFeedSubs = new RssFeedSubs();
        notifier.addSubscriber(rssFeedSubs);

        notifier.updateSubscribers("Heavy rain predicted.");
        newsSubscriber.printNews();
        rssFeedSubs.printNews();

        notifier.removeSubscriber(newsSubscriber);
        notifier.updateSubscribers("Thunderstorms predicted.");
        newsSubscriber.printNews();
        rssFeedSubs.printNews();

    }
}
