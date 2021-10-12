package com.qa.vehicle;

public class Bus extends Vehicle {

  private int numberOfPassengers;
  private String operator;


  public Bus(int numberOfPassengers, String operator) {
    super();
    this.numberOfPassengers = numberOfPassengers;
    this.operator = operator;
  }


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
    return "Bus [numberOfPassengers=" + numberOfPassengers + ", operator=" + operator + "]";
  }



}
