package com.project.service;

import com.project.model.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.project.repository.CityRepository;

import java.util.List;

@Service
public class CityService{

    @Autowired
    CityRepository cityRepository;

    public void insertCity(City city) {
        cityRepository.insert(city);
    }

    public List<City> getCities() {
       return cityRepository.findAll();
    }

}
