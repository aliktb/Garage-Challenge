package com.qa.vehicle;

public class Yacht extends Vehicle {


  private int cost;
  private boolean sails;

  // Constructor

  public Yacht(float engineSize, int topSpeed, String manufacturer, String mediumOfTravel, int cost,
      boolean sails) {
    super(engineSize, topSpeed, manufacturer, mediumOfTravel);
    this.cost = cost;
    this.sails = sails;
  }


  // Yacht specific Methods

  public float calcBill() {

    float bill = cost * 0.1f;

    return bill;


  }

  // Getters & Setters

  public int getCost() {
    return cost;
  }


  public void setCost(int cost) {
    this.cost = cost;
  }


  public boolean isSails() {
    return sails;
  }


  public void setSails(boolean sails) {
    this.sails = sails;
  }

  // toString() Method

  @Override
  public String toString() {
    return "Yacht [cost=" + cost + ", sails=" + sails + "]";
  }



}
