package com.example.demo.designPattern.behavioural.observer.headfirst.javaobserverable;

import lombok.extern.slf4j.Slf4j;

import java.util.Observable;
import java.util.Observer;

@Slf4j
public class DisplayForecast implements Observer, DisplayElement {
    Observable observable;
    private float temperature;
    private float humidity;

    public DisplayForecast(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    public void update(Observable observable, Object args) {
        if (observable instanceof WeatherData) {
            WeatherData weatherData = new WeatherData();
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();
        }
    }

    public void display() {
        log.info("  DisplayForecast   --> Current conditions: {} F degrees and {} % humidity", temperature, humidity);
    }
}