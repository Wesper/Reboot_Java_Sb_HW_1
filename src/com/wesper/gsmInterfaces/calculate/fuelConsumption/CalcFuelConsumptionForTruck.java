package com.wesper.gsmInterfaces.calculate.fuelConsumption;

public class CalcFuelConsumptionForTruck implements CalcFuelConsumption {

    private static final double TRUCK_FUEL_CONSUMPTION = 12.0d;

    @Override
    public double calcFuelConsumption(int mileage) {
        return TRUCK_FUEL_CONSUMPTION / 100 * mileage;
    }
}
