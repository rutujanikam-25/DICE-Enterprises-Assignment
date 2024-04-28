package com.weather.WeatherForecastApp.Dao;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.weather.WeatherForecastApp.model.WeatherForecast;
import com.weather.WeatherForecastApp.service.WeatherServices;

@Service
public class WheatherDao implements WeatherServices{
	
	
	private static final String API_URL = "https://rapidapi.com/wettercom-wettercom-default/api/forecast9/";
	private static final String API_KEY = "c5b7819886msh3b9910cab211b7cp16689bjsne137ce1aef0d";

    private final RestTemplate restTemplate;

    public WheatherDao(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public WeatherForecast getWeatherForecast(String city) {
        String url = API_URL.replace("{city}", city).replace("{apiKey}", API_KEY);
        return restTemplate.getForObject(url, WeatherForecast.class);
    }
}
