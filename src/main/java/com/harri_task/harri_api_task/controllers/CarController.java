package com.harri_task.harri_api_task.controllers;

import com.harri_task.harri_api_task.models.Car;
import com.harri_task.harri_api_task.services.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;



import java.util.List;

@RestController
@RequestMapping("/Cars")
public class CarController {

    @Autowired
    CarService carService;

    @GetMapping("/getAll")
    public List<Car> getAllCourse(){
        return carService.getAllCars();
    }



    //public Optional<Course> findById(@PathVariable Integer id){
    @GetMapping("/getAll/{counter}")
    public List<Car> getAllCourse(@PathVariable String counter){
        return carService.getAllCarsBy(counter);
    }
}
