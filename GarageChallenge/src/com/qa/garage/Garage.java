package com.qa.garage;

import java.util.ArrayList;
import com.qa.vehicle.Bus;
import com.qa.vehicle.Car;
import com.qa.vehicle.Vehicle;
import com.qa.vehicle.Yacht;

public class Garage {


  ArrayList<Vehicle> listOfVehicles = new ArrayList<>();


  public Car polo = new Car("polo", 1.6f, 120, "Volkswagen", "Road", 160, 300);

  public Car A4 = new Car("A4", 2f, 155, "Audi", "Road", 240, 500);

  public Bus londonBus = new Bus("londonBus", 4f, 60, "Alexander Dennis", "Bus Lane", 80, "TFL");

  public Yacht everGiven = new Yacht("everGiven", 16, 60, "yachtcompany", "sea", 25000000, false);

  public Bus bendyBus = new Bus("bendyBus", 3.5f, 45, "Scania", "Bus Lane", 50, "Not In Service");


  // fixes vehicle based on vehicle's bill
  public void repair(Vehicle vehicleID) {

    float bill = vehicleID.calcBill();

    System.out.print(vehicleID.getName() + " is Fixed. It cost £");
    System.out.printf("%.2f", bill);
    System.out.println("");

  }


  // CRUD methods

  // READ ALL
  public void seeAllVehicles() {

    for (Vehicle vehicle : listOfVehicles) {

      System.out.println(vehicle);

    }
  }


  // READ by ID
  public void seeVehicleByID(String name) {

    for (Vehicle vehicle : listOfVehicles) {

      if (vehicle.getName().equals(name)) {

        System.out.println(vehicle);

      }

    }


  }

  // CREATE
  public void addNewVehicle(Vehicle vehicleName) {



    listOfVehicles.add(vehicleName);


    System.out.println(vehicleName.getName() + " has been added to the garage");

  }


  // UPDATE
  public void upgradeVehicle(Vehicle vehicleName, String parameterToChange, String value) {


    switch (parameterToChange) {
      case "engineSize":

        // vehicleName.setEngineSize((float) value);


    }


    if (vehicleName.getClass().getSimpleName().equals("Bus")) {

      System.out.println(vehicleName);

    } else {
      System.out.println("not a bus");
    }

  }

  // DELETE by ID
  public void removeVehicleByID(String name) {

    for (Vehicle vehicle : listOfVehicles) {

      if (vehicle.getName().equals(name)) {

        listOfVehicles.remove(vehicle);

        break;

      }

    }

  }

  // DELETE ALL
  public void emptyGarage() {

    listOfVehicles.clear();

    System.out.println("Garage has been emptied");

  }

  // DELETE vehicles of same type

  public void removeVehicleByType(String VehicleType) {


    for (int i = listOfVehicles.size(); i < 0; i--) {

      if (listOfVehicles.get(i).getName().equals(VehicleType)) {

        listOfVehicles.remove(i);

      }
    }
  }

}


