package com.openapi.weather_project.Model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class getMain {
    private double temp;
    private double feels_like;
    private double temp_min;
    private double temp_max;
    private int pressure;
    private int humidity;
    private int sea_level;
    private int grnd_level;
}
