package controller;

import lombok.var;
import model.City;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class MyController {

    @GetMapping(value = "/cities")
    public List<City> getCities() {

        var cities = new ArrayList<City>();
        cities.add(new City(1L, "Bratislava", 432000));
        cities.add(new City(2L, "Budapest", 1759000));

        return cities;
    }
}