package com.harri_task.harri_api_task.models;

import jakarta.persistence.*;

@Entity
@Table(name = "cars")
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "car_brand", nullable = false)
    private String carBrand;

    @Column(name = "country_of_origin", nullable = false)
    private String countryOfOrigin;

    public Car() {
        super();
    }

    public Car(String carBrand, String countryOfOrigin) {
        this.carBrand = carBrand;
        this.countryOfOrigin = countryOfOrigin;
    }

    public Integer getId() {
        return id;
    }

//    public void setId(Integer id) {
//        this.id = id;
//    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    public void setCountryOfOrigin(String countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
    }
}
