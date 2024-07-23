package com.example.weather_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WeatherAppApplication {
	public static void main(String[] args) {
		System.err.println("It Works....");
		SpringApplication.run(WeatherAppApplication.class,args);
		System.err.println("It Works....");
	}
}
