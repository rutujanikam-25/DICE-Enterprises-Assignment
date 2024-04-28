package com.weather.WeatherForecastApp.service;

import com.weather.WeatherForecastApp.model.WeatherForecast;

public interface WeatherServices {
	WeatherForecast getWeatherForecast(String city);
}
