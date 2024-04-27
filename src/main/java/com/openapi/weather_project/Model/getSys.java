package com.openapi.weather_project.Model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class getSys {
    private int type;
    private int id;
    private String country;
    private long sunrise;
    private long sunset;
}
