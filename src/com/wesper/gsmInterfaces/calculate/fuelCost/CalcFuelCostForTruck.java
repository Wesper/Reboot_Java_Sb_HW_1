package com.wesper.gsmInterfaces.calculate.fuelCost;

public class CalcFuelCostForTruck implements CalcFuelCost{

    private static final double TRUCK_FUEL_COST = 48.90;

    @Override
    public double calcFuelCost(double fuelConsamption) {
        return fuelConsamption * TRUCK_FUEL_COST;
    }
}
