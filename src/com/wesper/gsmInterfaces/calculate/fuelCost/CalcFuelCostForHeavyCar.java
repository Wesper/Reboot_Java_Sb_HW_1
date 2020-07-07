package com.wesper.gsmInterfaces.calculate.fuelCost;

public class CalcFuelCostForHeavyCar implements CalcFuelCost{

    private static final double HEAVY_CAR_FUEL_COST = 48.90d;

    @Override
    public double calcFuelCost(double fuelConsamption) {
        return fuelConsamption * HEAVY_CAR_FUEL_COST;
    }
}
