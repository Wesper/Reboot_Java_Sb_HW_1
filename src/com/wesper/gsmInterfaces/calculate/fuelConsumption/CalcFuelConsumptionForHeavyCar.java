package com.wesper.gsmInterfaces.calculate.fuelConsumption;

public class CalcFuelConsumptionForHeavyCar implements CalcFuelConsumption {

    private static final double HEAVY_CAR_FUEL_CONSUMPTION = 20.0d;

    @Override
    public double calcFuelConsumption(int mileage) {
        return HEAVY_CAR_FUEL_CONSUMPTION / 100 * mileage;
    }
}
