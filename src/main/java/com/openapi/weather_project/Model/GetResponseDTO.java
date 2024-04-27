package com.openapi.weather_project.Model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Data
public class GetResponseDTO {
    private GetCord coord;
    private List<getWheather> weather;

    private String base;
    private getMain main;
    private int visibility;
    private getWind wind;
    private getCloud clouds;
    private long dt;
    private getSys sys;
    private int timezone;
    private int id;
    private String name;
    private int cod;




}
