package com.qa.vehicle;

public class Bus extends Vehicle {

  private int numberOfPassengers;
  private String operator;

  // Constructor

  public Bus(float engineSize, int topSpeed, String manufacturer, String mediumOfTravel,
      int numberOfPassengers, String operator) {
    super(engineSize, topSpeed, manufacturer, mediumOfTravel);
    this.numberOfPassengers = numberOfPassengers;
    this.operator = operator;
  }



  // Bus specific Methods

  public float calcBill() {

    float bill = numberOfPassengers * this.getEngineSize();

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

  // toString() Method

  @Override
  public String toString() {
    return "Bus [numberOfPassengers=" + numberOfPassengers + ", operator=" + operator + "]";
  }



}
