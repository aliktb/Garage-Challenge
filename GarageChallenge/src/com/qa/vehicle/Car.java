package com.qa.vehicle;

public class Car extends Vehicle {


  private int horsepower;
  private float range;


  public Car(int horsepower, float range) {
    super();
    this.horsepower = horsepower;
    this.range = range;
  }


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
    return "Car [horsepower=" + horsepower + ", range=" + range + "]";
  }



}
