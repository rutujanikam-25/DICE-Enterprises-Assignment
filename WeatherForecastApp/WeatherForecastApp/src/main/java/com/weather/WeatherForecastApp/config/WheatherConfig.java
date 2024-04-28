package com.weather.WeatherForecastApp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;

@Configuration
public class WheatherConfig {
	@Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    
	
	
	
	} 
}
