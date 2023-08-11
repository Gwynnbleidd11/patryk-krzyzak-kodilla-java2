package com.kodilla.testing.weather.stub;

import java.lang.reflect.Array;
import java.util.*;

public class WeatherForecast {

    private  Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature: temperatures.getTemperatures().entrySet()) {
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0);
        }
        return resultMap;
    }

    public double averageTemperature() {
        double sum = 0;
        double average;

        for (Map.Entry<String, Double> temperature: temperatures.getTemperatures().entrySet()) {
            sum = sum + temperature.getValue();
        }
        average = sum / temperatures.getTemperatures().size();
        return average;
    }

    public double medianTemperature() {
        Map<String, Double> medianTemperatureMap = new HashMap<>();
        List<Double> medianTemperatures = new ArrayList<>();
        double median;

        for (Map.Entry<String, Double> temperature: temperatures.getTemperatures().entrySet()) {
            medianTemperatureMap.put(temperature.getKey(), temperature.getValue());
            medianTemperatures.add(temperature.getValue());
        }

        Collections.sort(medianTemperatures);
        if (medianTemperatures.size() % 2 == 0) {
            median =  (medianTemperatures.get((medianTemperatures.size() - 1) / 2) + medianTemperatures.get(medianTemperatures.size() / 2)) / 2;
        } else {
            median = medianTemperatures.get(medianTemperatures.size() / 2);
        }
        return median;
    }
}
