package com.qa.runner;

import com.qa.garage.Garage;

public class Runner {

  public static void main(String[] args) {

    Garage myGarage = new Garage();

    myGarage.seeAllVehicles();

    myGarage.addNewVehicle(myGarage.polo);

    myGarage.addNewVehicle(myGarage.londonBus);

    myGarage.addNewVehicle(myGarage.everGiven);

    myGarage.seeAllVehicles();

    myGarage.repair(myGarage.polo);

    myGarage.addNewVehicle(myGarage.bendyBus);

    myGarage.repair(myGarage.londonBus);

    System.out.println("////////////");

    myGarage.seeVehicleByID("londonBus");

    myGarage.upgradeVehicle(myGarage.londonBus, "passengers", 10, "");

    myGarage.seeVehicleByID("londonBus");

    myGarage.removeVehicleByType("Car");

    myGarage.removeVehicleByID("polo");

    myGarage.seeAllVehicles();

    myGarage.emptyGarage();

    myGarage.seeAllVehicles();



  }

}
