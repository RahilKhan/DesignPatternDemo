package com.example.demo.designPattern.behavioural.observer.headfirst.javaobserverable;

import lombok.Getter;

import java.util.Observable;

@Getter
public class WeatherData extends Observable {
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
    }

    /**
     * Calls Observable class methods
     * */
    public void measurementsChanged() {
        setChanged();
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    /** other WeatherData methods here */
}
