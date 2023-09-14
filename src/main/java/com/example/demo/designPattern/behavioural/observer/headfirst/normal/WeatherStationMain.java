package com.example.demo.designPattern.behavioural.observer.headfirst.normal;

import java.util.ArrayList;

public class WeatherStationMain {

    public static void main(String[] args) {
//        WeatherData weatherData = new WeatherData();
        ArrayList<Observer> observers = new ArrayList<>();
        observers.add(new DisplayCurrentConditions());
        observers.add(new DisplayStatistics());
        WeatherData weatherData = new WeatherData(observers);
//        DisplayCurrentConditions currentDisplay = new DisplayCurrentConditions(weatherData);
//        DisplayStatistics displayStatistics = new DisplayStatistics(weatherData);
        DisplayForecast DisplayForecast = new DisplayForecast(weatherData);
        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);
    }
}
