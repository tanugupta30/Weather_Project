package com.openapi.weather_project.Controller;

import com.openapi.weather_project.Model.GetResponseDTO;
import com.openapi.weather_project.Service.WheatherService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/weather")
public class WheatherController {
  private WheatherService serv;

    public WheatherController(WheatherService serv) {
        this.serv = serv;
    }

    @GetMapping("/{name}")
    public @ResponseBody GetResponseDTO getWheatherByCity(@PathVariable("name") String name){

        return serv.weatherByName(name);
    }
}
