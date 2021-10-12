package com.qa.runner;

import com.qa.garage.Garage;
import com.qa.vehicle.Bus;
import com.qa.vehicle.Car;
import com.qa.vehicle.Yacht;

public class Runner {

  public static void main(String[] args) {


    Car polo = new Car("polo", 1.6f, 120, "Volkswagen", "Road", 160, 300);

    Car A4 = new Car("A4", 2f, 155, "Audi", "Road", 240, 500);

    Bus londonBus = new Bus("londonBus", 4f, 60, "Alexander Dennis", "Bus Lane", 80, "TFL");

    Yacht everGiven = new Yacht("everGiven", 16, 60, "yachtcompany", "sea", 25000000, false);

    Bus bendyBus = new Bus("bendyBus", 3.5f, 45, "Scania", "Bus Lane", 50, "Not In Service");

    Garage myGarage = new Garage();

    myGarage.seeAllVehicles();

    myGarage.addNewVehicle(polo);

    myGarage.addNewVehicle(londonBus);

    myGarage.addNewVehicle(everGiven);

    myGarage.seeAllVehicles();

    myGarage.repair(polo);

    myGarage.addNewVehicle(bendyBus);

    myGarage.addNewVehicle(A4);

    myGarage.repair(londonBus);

    System.out.println("////////////");

    myGarage.seeVehicleByID("londonBus");

    myGarage.upgradeVehicle(londonBus, "passengers", 10, "");

    myGarage.seeVehicleByID("londonBus");

    System.out.println(".......");

    myGarage.removeVehicleByType("Bus");

    myGarage.removeVehicleByID("polo");


    myGarage.seeAllVehicles();

    myGarage.emptyGarage();

    myGarage.seeAllVehicles();



  }

}
