package com.qa.garage;

import java.util.ArrayList;
import com.qa.vehicle.Bus;
import com.qa.vehicle.Car;
import com.qa.vehicle.Vehicle;
import com.qa.vehicle.Yacht;

public class Garage {


  ArrayList<Vehicle> listOfVehicles = new ArrayList<>();



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
  public void upgradeVehicle(Vehicle vehicleName, String parameterToChange, float value,
      String text) {

    switch (parameterToChange) {

      case "engineSize":
        vehicleName.setEngineSize(value);
        break;
      case "topSpeed":
        vehicleName.setTopSpeed((int) value);
        break;
      case "manufacturer":
        vehicleName.setManufacturer(text);
        break;
      case "mediumOfTravel":
        vehicleName.setMediumOfTravel(text);
        break;
      default:

        break;

    }


    if (vehicleName.getClass().getSimpleName().equals("Bus")) {

      Bus b = (Bus) vehicleName;


      switch (parameterToChange) {

        case "passengers":
          b.setNumberOfPassengers((int) value);
          break;
        case "operator":
          b.setOperator(text);
          break;
        default:
          break;

      }
    }

    else if (vehicleName.getClass().getSimpleName().equals("Car")) {

      Car c = (Car) vehicleName;


      switch (parameterToChange) {

        case "horsepower":
          c.setHorsepower((int) value);
          break;
        case "range":
          c.setRange((int) value);
          break;
        default:
          break;

      }
    }

    else if (vehicleName.getClass().getSimpleName().equals("Yacht")) {

      Yacht y = (Yacht) vehicleName;

      switch (parameterToChange) {

        case "sail":
          if (value == 0) {

            y.setSails(false);

          }

          else {

            y.setSails(true);

          }

          break;


        case "cost":
          y.setCost((int) value);
          break;
        default:
          break;
      }
    }

    else {

      System.out.println("This vehicle does not belong to a type");

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


    for (int i = listOfVehicles.size() - 1; i > 0; i--) {



      if (listOfVehicles.get(i).getClass().getSimpleName().equals(VehicleType)) {

        listOfVehicles.remove(i);

      }
    }
  }

}


