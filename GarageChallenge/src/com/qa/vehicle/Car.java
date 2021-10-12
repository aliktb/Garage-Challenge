package com.qa.vehicle;

public class Car extends Vehicle {


  private int horsepower;
  private float range;

  // Constructor

  public Car(float engineSize, int topSpeed, String manufacturer, String mediumOfTravel,
      int horsepower, float range) {
    super(engineSize, topSpeed, manufacturer, mediumOfTravel);
    this.horsepower = horsepower;
    this.range = range;
  }

  // Car specific Methods

  public float calcBill() {

    float bill = horsepower * (range - 10);

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

  // toString() Method

  @Override
  public String toString() {
    return "Car [horsepower=" + horsepower + ", range=" + range + "]";
  }



}
