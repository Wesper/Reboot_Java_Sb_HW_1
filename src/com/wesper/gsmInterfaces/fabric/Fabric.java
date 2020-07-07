package com.wesper.gsmInterfaces.fabric;

import com.wesper.gsmInterfaces.cars.Cars;

public interface Fabric {

    Cars createCar(int codeCar, int number, int mileage, int other);

    double calcFuelConsumption(int mileage);

    double calcFuelCost(double fuelConsumption);

}
