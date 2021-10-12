package com.qa.vehicle;

public class Yacht extends Vehicle {


  private int cost;
  private boolean sails;


  public Yacht(int cost, boolean sails) {
    super();
    this.cost = cost;
    this.sails = sails;
  }


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
    return "Yacht [cost=" + cost + ", sails=" + sails + "]";
  }



}
