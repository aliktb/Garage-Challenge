package com.qa.vehicle;

public class Vehicle {

  private float engineSize;
  private int topSpeed;
  private String manufacturer;
  private String mediumOfTravel;

  // Constructor

  public Vehicle(float engineSize, int topSpeed, String manufacturer, String mediumOfTravel) {
    super();
    this.engineSize = engineSize;
    this.topSpeed = topSpeed;
    this.manufacturer = manufacturer;
    this.mediumOfTravel = mediumOfTravel;
  }

  // Getters & Setters

  public float getEngineSize() {
    return engineSize;
  }

  public void setEngineSize(float engineSize) {
    this.engineSize = engineSize;
  }

  public int getTopSpeed() {
    return topSpeed;
  }

  public void setTopSpeed(int topSpeed) {
    this.topSpeed = topSpeed;
  }

  public String getManufacturer() {
    return manufacturer;
  }

  public void setManufacturer(String manufacturer) {
    this.manufacturer = manufacturer;
  }

  public String getMediumOfTravel() {
    return mediumOfTravel;
  }

  public void setMediumOfTravel(String mediumOfTravel) {
    this.mediumOfTravel = mediumOfTravel;
  }

  // toString() Method

  @Override
  public String toString() {
    return "Vehicle [engineSize=" + engineSize + ", topSpeed=" + topSpeed + ", manufacturer="
        + manufacturer + ", mediumOfTravel=" + mediumOfTravel + "]";
  }



}
