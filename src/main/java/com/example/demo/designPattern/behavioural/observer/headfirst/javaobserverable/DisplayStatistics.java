package com.example.demo.designPattern.behavioural.observer.headfirst.javaobserverable;

import lombok.extern.slf4j.Slf4j;

import java.util.Observable;
import java.util.Observer;

@Slf4j
public class DisplayStatistics implements Observer, DisplayElement {

    Observable observable;
    private float temperature;
    private float humidity;

    public DisplayStatistics(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    public void update(Observable obs, Object args) {
        if (obs instanceof WeatherData) {
            WeatherData weatherData = new WeatherData();
            this.temperature = temperature;
            this.humidity = humidity;
            display();
        }
    }

    public void display() {
        log.info("DisplayStatistics --> Current conditions: {} F degrees and {} % humidity", temperature, humidity);
    }
}
