package com.wesper.gsmInterfaces.calculate.fuelCost;

public class CalcFuelCostForCar implements CalcFuelCost{

    private static final double CAR_FUEL_COST = 46.10d;

    @Override
    public double calcFuelCost(double fuelConsamption) {
        return fuelConsamption * CAR_FUEL_COST;
    }
}
