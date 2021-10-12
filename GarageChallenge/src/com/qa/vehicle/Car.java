package com.qa.vehicle;

public class Car extends Vehicle {


  private int horsepower;
  private float range;

  // Constructor

  public Car(String name, float engineSize, int topSpeed, String manufacturer,
      String mediumOfTravel, int horsepower, float range) {
    super(name, engineSize, topSpeed, manufacturer, mediumOfTravel);
    this.horsepower = horsepower;
    this.range = range;
  }

  // Car specific Methods

  @Override
  public float calcBill() {

    float bill = ((horsepower - 100) * (range - 10)) / 20;

    return bill;


  }


  // Getters & Setters

  public int getHorsepower() {
    return horsepower;
  }


  public void setHorsepower(int horsepower) {
    this.horsepower = horsepower;
  }


  public float getRange() {
    return range;
  }


  public void setRange(float range) {
    this.range = range;
  }

  @Override
  public String toString() {
    return "Car [getName()=" + getName() + ", getEngineSize()=" + getEngineSize()
        + ", getTopSpeed()=" + getTopSpeed() + ", getManufacturer()=" + getManufacturer()
        + ", getMediumOfTravel()=" + getMediumOfTravel() + ", toString()=" + super.toString()
        + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", horsepower=" + horsepower
        + ", range=" + range + ", calcBill()=" + calcBill() + ", getHorsepower()=" + getHorsepower()
        + ", getRange()=" + getRange() + "]";
  }



  // toString() Method



}
