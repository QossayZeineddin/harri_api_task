package com.harri_task.harri_api_task.controllers;

import com.harri_task.harri_api_task.models.Car;
import com.harri_task.harri_api_task.services.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;



import java.util.List;

@RestController
@RequestMapping("server/car")
public class CarController {

    @Autowired
    CarService carService;

    @GetMapping(value = {"/getAll", ""})
    public List<Car> getAllCArs(){
        return carService.getAllCars();
    }

    @GetMapping("/getById/{id}")
    public List<Car> getByID(@PathVariable int id){
        return carService.getByID(id);
    }


    @GetMapping("/getby/{country}")
    public List<Car> findByCountryName(@PathVariable String country){
        return carService.getAllCarsByCountryOfOrigin(country);
    }

    @GetMapping("/getby/{country}/{num}")
    public List<Car> findByCountryNameNums(@PathVariable String country , @PathVariable int num){
        return carService.getByCountryAndLimit(country ,  num);
    }


//    @GetMapping("/getbyBrand/{carBrand}")
//    public List<Car> findBycarBrand(@PathVariable String carBrand ) {
//        return carService.getByCarBrand(carBrand);
//    }

    @GetMapping("/getbyBrand/")
    public List<Car> findByCarBrand(@RequestParam(name = "brand") String carBrand) {
        return carService.getByCarBrand(carBrand);
    }

}
