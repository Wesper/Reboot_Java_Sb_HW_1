package com.wesper.gsmInterfaces.calculate.fuelConsumption;

public class CalcFuelConsumptionForCar implements CalcFuelConsumption {

    private static final double CAR_FUEL_CONSUMPTION = 12.5d;

    @Override
    public double calcFuelConsumption(int mileage) {
        return CAR_FUEL_CONSUMPTION / 100 * mileage;
    }
}
