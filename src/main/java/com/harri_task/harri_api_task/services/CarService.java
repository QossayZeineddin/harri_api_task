package com.harri_task.harri_api_task.services;

import com.harri_task.harri_api_task.models.Car;
import com.harri_task.harri_api_task.repositories.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService {

    @Autowired
    private CarRepository carRepository;

    public List<Car>  getAllCars(){
        return carRepository.findAll();
    }

    public List<Car>  getAllCarsByCountryOfOrigin(String countryOfOrigin){
        return carRepository.findBycountryOfOrigin(countryOfOrigin);
    }

    public List<Car> getByCountryAndLimit(String country , int num){
        return carRepository.findByCountryOfOriginCustomQuery(country , num);
    }

    public List<Car> getByCarBrand(String carBrand){
        return carRepository.findBycarBrand(carBrand);
    }
}
