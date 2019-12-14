package com.companic.controller;

import com.companic.model.TaxiPark;
import com.companic.model.entity.car.Car;
import com.companic.model.entity.truck.Truck;
import com.companic.utils.CarsInitializer;
import com.companic.utils.ConfigConstants;
import com.companic.utils.ResourceManager;
import com.companic.view.View;

import java.util.Locale;

public class Controller {

    private View view;
    private ResourceManager resourceManager = ResourceManager.INSTANCE;

    public Controller(View view) {
        this.view = view;
    }

    public void run() {
        resourceManager.setLocale(new Locale(resourceManager.getConfigProperty(ConfigConstants.LOCALE_CURRENT)));

        Truck[] trucks = CarsInitializer.initTrucksFromJsonFile();
        Car[] cars = CarsInitializer.initPassengerCarsFromJsonFile();

        TaxiPark taxiPark = new TaxiPark(cars, trucks);

        view.printInitialProgramInfo(taxiPark.getVehicles());

        view.printSortedByFuelConsumptionAsc(taxiPark.sortByFuelConsumptionAsc());

        view.printTotalValue(taxiPark.calculateTotalValue());

        view.printCarsWithinSpeedRange(130, 260, taxiPark.findCarsWithinGivenMaxSpeedRange(130, 260));
    }
}
