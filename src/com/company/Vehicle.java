package com.company;

import java.time.LocalDate;

public abstract class Vehicle {
    private String model;
    private int yearOfIssue;
    private TypeOfEngine typeOfEngine;

//    public Vehicle() {
//    }

    public Vehicle(String model, int yearOfIssue, TypeOfEngine typeOfEngine) {
        this.model = model;

        this.yearOfIssue = yearOfIssue;
        this.typeOfEngine = typeOfEngine;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYearOfIssue() {
        return yearOfIssue;
    }

    public void setYearOfIssue(int yearOfIssue) {
        this.yearOfIssue = yearOfIssue;
    }

    public TypeOfEngine getTypeOfEngine() {
        return typeOfEngine;
    }

    public void setTypeOfEngine(TypeOfEngine typeOfEngine) {
        this.typeOfEngine = typeOfEngine;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "model='" + model + '\'' +
                ", yearOfIssue=" + yearOfIssue +
                ", typeOfEngine=" + typeOfEngine +
                '}';
    }
}
