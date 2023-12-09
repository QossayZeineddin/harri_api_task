package com.harri_task.harri_api_task.repositories;

import com.harri_task.harri_api_task.models.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;

@Repository
public interface CarRepository extends JpaRepository<Car, Integer> {
    List<Car> findBycountryOfOrigin(String country_of_origin);
    List<Car> findBycarBrand(String car_brand);

    List<Car> findCarById(int id);

    @Query(value = "SELECT * FROM cars c WHERE c.country_of_origin = :country_of_origin LIMIT :num", nativeQuery = true)
    List<Car> findByCountryOfOriginCustomQuery(@Param("country_of_origin") String country_of_origin, @Param("num") int num);


}