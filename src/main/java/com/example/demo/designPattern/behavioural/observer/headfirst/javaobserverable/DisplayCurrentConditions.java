package com.example.demo.designPattern.behavioural.observer.headfirst.javaobserverable;

import java.util.Observable;
import java.util.Observer;

public class DisplayCurrentConditions implements Observer, DisplayElement {
    Observable observable;
    private float temperature;
    private float humidity;

    public DisplayCurrentConditions(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    public void update(Observable obs, Object args) {
//        if(obs instanceof(WeatherData weatherData) ){
        if (obs instanceof WeatherData) {
            WeatherData weatherData = new WeatherData();
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();
        }
    }

    public void display() {
        System.out.println("Current conditions: " + temperature
                + "F degrees and " + humidity + "% humidity");
    }
}
