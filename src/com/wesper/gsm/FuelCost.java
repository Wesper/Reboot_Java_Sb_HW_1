package com.wesper.gsm;

public class FuelCost {

    /**
     * carFuelCost - стоимость литра топлива легкового овтомобиля
     * truckFuelCost - стоимость литра топлива грузового овтомобиля
     * passengerFuelCost - стоимость литра топлива пассажирского овтомобиля
     * heavyCarFuelCost - стоимость литра топлива тяжелой техники
     */
    private final double carFuelCost = 46.10;
    private final double truckFuelCost = 48.90;
    private final double passengerFuelCost = 47.50;
    private final double heavyCarFuelCost = 48.90;

    /**
     *
     * @param typeCar - код типа автомобиля
     * @param fuelConsumption - расход топлива автомобиля за пробег
     * @return возвращает стоимость топлива автомобиля за пробег
     */
    public double fuelCost(int typeCar, double fuelConsumption) {
        double cost = 0.0;
        switch (typeCar) {
            case 100 :
                cost = fuelConsumption * carFuelCost;
                break;
            case 200 :
                cost = fuelConsumption * truckFuelCost;
                break;
            case 300 :
                cost = fuelConsumption * passengerFuelCost;
                break;
            case 400 :
                cost = fuelConsumption * heavyCarFuelCost;
                break;
        }
        return cost;
    }
}
