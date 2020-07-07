package com.wesper.gsmInterfaces.calculate.fuelCost;

public class CalcFuelCostForPassenger implements CalcFuelCost{

    private static final double PASSENGER_FUEL_COST = 47.50d;

    @Override
    public double calcFuelCost(double fuelConsamption) {
        return fuelConsamption * PASSENGER_FUEL_COST;
    }
}
