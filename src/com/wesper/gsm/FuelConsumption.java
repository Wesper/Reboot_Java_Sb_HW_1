package com.wesper.gsm;

public class FuelConsumption {

    /**
     * carFuelConsumption - расход топлива легкового автомобиля на 100 км
     * truckFuelConsumption - расход топлива грузового автомобиля на 100 км
     * passengerFuelConsumption - расход топлива пассажирского автомобиля на 100 км
     * heavyCarFuelConsumption - расход топлива тяжелой техники на 100 км
     */
    private final double carFuelConsumption = 12.5;
    private final double truckFuelConsumption = 12.0;
    private final double passengerFuelConsumption = 11.5;
    private final double heavyCarFuelConsumption = 20;

    /**
     *
     * @param typeCar - код типа автомобиля
     * @param mileage - пробег автомобиля
     * @return возвращает расход топлива автомобиля за пробег
     */
    public double fuelConsumption(int typeCar, int mileage) {
        double fuelConsumption = 0.0;
        switch (typeCar) {
            case 100 :
                fuelConsumption = carFuelConsumption / 100 * mileage;
                break;
            case 200 :
                fuelConsumption = truckFuelConsumption / 100 * mileage;
                break;
            case 300 :
                fuelConsumption = passengerFuelConsumption / 100 * mileage;
                break;
            case 400 :
                fuelConsumption = heavyCarFuelConsumption / 100 * mileage;
                break;
        }
        return fuelConsumption;
    }
}
