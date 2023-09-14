package com.example.demo.designPattern.behavioural.observer.headfirst.normal;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DisplayStatistics implements Observer, DisplayElement {

    private float temperature;
    private float humidity;
    private Subject weatherData;

    public DisplayStatistics() {}
    public DisplayStatistics(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    public void display() {
        log.info("DisplayStatistics --> Current conditions: {} F degrees and {} % humidity", temperature, humidity);
    }
}
