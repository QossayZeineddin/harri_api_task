package com.harri_task.harri_api_task.repositories;

import com.harri_task.harri_api_task.models.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarRepository extends JpaRepository<Car, Integer> {
    //Car findByCountry_of_Origin(String Country_of_Origin);
    List<Car> findBycountryOfOrigin(String country_of_origin);
}