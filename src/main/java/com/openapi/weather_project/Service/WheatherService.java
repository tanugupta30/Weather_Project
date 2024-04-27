package com.openapi.weather_project.Service;

import com.openapi.weather_project.Exception.NotFoundException;
import com.openapi.weather_project.Model.GetResponseDTO;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WheatherService {
    private String baseUrl;
    private String token;

    public WheatherService(@Value("${openWheatherApplication}")String baseUrl, @Value("${app_id}")String token) {
        this.baseUrl = baseUrl;
        this.token = token;
    }
    RestTemplate rest= new RestTemplate();
    public GetResponseDTO weatherByName(String name){
        String url = baseUrl+"?q="+name+"&appid="+token;
        GetResponseDTO response=rest.getForObject(url, GetResponseDTO.class);
        if(response==null){
              new NotFoundException();
        }
        return response;
    }

}
