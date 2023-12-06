package com.harri_task.harri_api_task.models;

import jakarta.persistence.*;

@Entity
public class Top10Report {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "State", nullable = false)
    private String state;

    @Column(name = "Rank", nullable = false)

    private int rank;

    @Column(name = "Make_Model", nullable = false)
    private String makeModel;

    @Column(name = "Model_Year", nullable = false)
    private int modelYear;

    @Column(name = "Thefts", nullable = false)
    private int thefts;

    // Constructors, getters, and setters

    public Top10Report() {
        super();
    }

    public Top10Report(String state, int rank, String makeModel, int modelYear, int thefts) {
        super();
        this.state = state;
        this.rank = rank;
        this.makeModel = makeModel;
        this.modelYear = modelYear;
        this.thefts = thefts;
    }

    // Getters and Setters (or use Lombok for automatic generation)

    public Long getId() {
        return id;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public String getMakeModel() {
        return makeModel;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    public int getModelYear() {
        return modelYear;
    }

    public void setModelYear(int modelYear) {
        this.modelYear = modelYear;
    }

    public int getThefts() {
        return thefts;
    }

    public void setThefts(int thefts) {
        this.thefts = thefts;
    }
}
