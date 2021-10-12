package com.qa.vehicle;

public class Vehicle {


  private String name;
  private float engineSize;
  private int topSpeed;
  private String manufacturer;
  private String mediumOfTravel;


  // Constructor

  public Vehicle(String name, float engineSize, int topSpeed, String manufacturer,
      String mediumOfTravel) {
    super();
    this.name = name;
    this.engineSize = engineSize;
    this.topSpeed = topSpeed;
    this.manufacturer = manufacturer;
    this.mediumOfTravel = mediumOfTravel;
  }

  // calcBill method

  public float calcBill() {

    return 0f;

  }


  // Getters & Setters

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

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



  @Override
  public String toString() {
    return "Vehicle [name=" + name + ", engineSize=" + engineSize + ", topSpeed=" + topSpeed
        + ", manufacturer=" + manufacturer + ", mediumOfTravel=" + mediumOfTravel + ", calcBill()="
        + calcBill() + ", getEngineSize()=" + getEngineSize() + ", getTopSpeed()=" + getTopSpeed()
        + ", getManufacturer()=" + getManufacturer() + ", getMediumOfTravel()="
        + getMediumOfTravel() + ", getName()=" + getName() + "]";
  }



  // toString() Method



}
