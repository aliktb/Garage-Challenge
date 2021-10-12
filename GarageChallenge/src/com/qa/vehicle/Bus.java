package com.qa.vehicle;

public class Bus extends Vehicle {

  private int numberOfPassengers;
  private String operator;

  // Constructor

  public Bus(String name, float engineSize, int topSpeed, String manufacturer,
      String mediumOfTravel, int numberOfPassengers, String operator) {
    super(name, engineSize, topSpeed, manufacturer, mediumOfTravel);
    this.numberOfPassengers = numberOfPassengers;
    this.operator = operator;
  }



  // Bus specific Methods

  @Override
  public float calcBill() {

    float bill = numberOfPassengers * this.getEngineSize() + 1000;

    return bill;


  }


  // Getters & Setters

  public int getNumberOfPassengers() {
    return numberOfPassengers;
  }


  public void setNumberOfPassengers(int numberOfPassengers) {
    this.numberOfPassengers = numberOfPassengers;
  }


  public String getOperator() {
    return operator;
  }


  public void setOperator(String operator) {
    this.operator = operator;
  }



  @Override
  public String toString() {
    return "Bus [getName()=" + getName() + ", getEngineSize()=" + getEngineSize()
        + ", getTopSpeed()=" + getTopSpeed() + ", getManufacturer()=" + getManufacturer()
        + ", getMediumOfTravel()=" + getMediumOfTravel() + ", toString()=" + super.toString()
        + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", numberOfPassengers="
        + numberOfPassengers + ", operator=" + operator + ", calcBill()=" + calcBill()
        + ", getNumberOfPassengers()=" + getNumberOfPassengers() + ", getOperator()="
        + getOperator() + "]";
  }



  // toString() Method



}
