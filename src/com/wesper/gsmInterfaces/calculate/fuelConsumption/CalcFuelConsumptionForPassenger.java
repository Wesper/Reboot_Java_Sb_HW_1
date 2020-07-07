package com.wesper.gsmInterfaces.calculate.fuelConsumption;

public class CalcFuelConsumptionForPassenger implements CalcFuelConsumption {

    private static final double PASSENGER_FUEL_CONSUMPTION = 11.5d;

    @Override
    public double calcFuelConsumption(int mileage) {
        return PASSENGER_FUEL_CONSUMPTION / 100 * mileage;
    }
}
