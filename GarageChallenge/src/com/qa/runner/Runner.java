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

    myGarage.repair(myGarage.londonBus);

    // myGarage.upgradeVehicle(myGarage.londonBus);

    myGarage.seeVehicleByID("londonBus");



  }

}
