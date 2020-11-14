package com.project.controller;

import com.project.model.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.project.service.CityService;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class MyController {
    @Autowired
    public CityService cityService;

    @GetMapping(value = "/cities")
    public String getCities(@RequestParam String name, @RequestParam Integer population) {

        City city = new City();
        city.setName(name);
        city.setPopulation(population);

        cityService.insertCity(city);

        return "cities";
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping(value = "/getCities")
    public List<City> getCities() {

        return cityService.getCities();
    }
}
