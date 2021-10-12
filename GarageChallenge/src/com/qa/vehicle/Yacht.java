package com.qa.vehicle;

public class Yacht extends Vehicle {


  private int cost;
  private boolean sails;

  // Constructor

  public Yacht(String name, float engineSize, int topSpeed, String manufacturer,
      String mediumOfTravel, int cost, boolean sails) {
    super(name, engineSize, topSpeed, manufacturer, mediumOfTravel);
    this.cost = cost;
    this.sails = sails;
  }


  // Yacht specific Methods

  @Override
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


  @Override
  public String toString() {
    return "Yacht [getName()=" + getName() + ", getEngineSize()=" + getEngineSize()
        + ", getTopSpeed()=" + getTopSpeed() + ", getManufacturer()=" + getManufacturer()
        + ", getMediumOfTravel()=" + getMediumOfTravel() + ", toString()=" + super.toString()
        + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", cost=" + cost
        + ", sails=" + sails + ", calcBill()=" + calcBill() + ", getCost()=" + getCost()
        + ", isSails()=" + isSails() + "]";
  }

  // toString() Method



}
