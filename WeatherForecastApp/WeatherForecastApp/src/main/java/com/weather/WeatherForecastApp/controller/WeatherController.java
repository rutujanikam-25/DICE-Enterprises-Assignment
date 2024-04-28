package com.weather.WeatherForecastApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.weather.WeatherForecastApp.model.WeatherForecast;
import com.weather.WeatherForecastApp.service.WeatherServices;



@Controller

public class WeatherController {
	private final WeatherServices weatherService;

    public WeatherController(WeatherServices weatherService) {
        this.weatherService = weatherService;
    }

    @GetMapping("/weather")
    public WeatherForecast getWeatherForecast(@RequestParam("city") String city) {
    	System.out.println("hello");
    	System.out.println("Hi"+weatherService.getWeatherForecast(city));
    	       return weatherService.getWeatherForecast(city);
        
    }
    
    @GetMapping("/")
    public String Homepage()
    {
    	return "WeatherForecast";
    }
    
    
}