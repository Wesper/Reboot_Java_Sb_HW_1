package com.wesper.gsmInterfaces.cars;

public abstract class Cars {

    /**
     * codeCar - код типа автомобиля
     * number - гос. номер
     * mileage - пробег
     * fuelConsumption - потребление топлива за пробег
     * fuelCost - стоимость топлива за пробег
     * other - объем перевезенного груза / число перевезенных пассажиров / вес поднятых грузов
     */
    private int codeCar;
    private int number;
    private int mileage;
    private int other;
    private double fuelConsumption;
    private double fuelCost;

    public Cars(int codeCar, int number, int mileage, int other) {
        this.codeCar = codeCar;
        this.number = number;
        this.mileage = mileage;
        this.other = other;
    }

    public int getCodeCar() {
        return codeCar;
    }

    public int getNumber() {
        return number;
    }

    public int getMileage() {
        return mileage;
    }

    public int getOther() {
        return other;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public double getFuelCost() {
        return fuelCost;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public void setOther(int other) {
        this.other = other;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public void setFuelCost(double fuelCost) {
        this.fuelCost = fuelCost;
    }
}
