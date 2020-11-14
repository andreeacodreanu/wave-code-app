package controller;

import lombok.var;
import model.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import service.CityService;

import java.util.ArrayList;
import java.util.List;

@RestController
public class MyController {
    @Autowired
    public CityService cityService;

    @GetMapping(value = "/cities")
    public String getCities() {

        City city = new City();
        city.setName("lalalalala");
        city.setPopulation(123456789);

        cityService.insertCity(city);


        return "cities";
    }
}
