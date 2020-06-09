package com.wesper.gsm;

public class Car {

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

    /**
     *
     * @param data - массив параметров автомобиля
     */
    public Car(int[] data) {
        this.codeCar = data[0];
        this.number = data[1];
        this.mileage = data[2];
        this.other = setOther(data);
        this.fuelConsumption = new FuelConsumption().fuelConsumption(codeCar, mileage);
        this.fuelCost = new FuelCost().fuelCost(codeCar, fuelConsumption);
    }

    /**
     *
     * @param data - массив параметров автомобиля
     * @return возвращает значение параметра other, если оно имеется в массиве
     */
    public int setOther(int[] data) {
        int other;
        if (data.length == 4) {
            other = data[3];
        } else {
            other = 0;
        }
        return other;
    }

    /**
     *
     * @return Возвращает код типа автомобиля
     */
    public int getCodeCar() {
        return codeCar;
    }

    /**
     *
     * @return Возвращает гос. номер автомобиля
     */
    public int getNumber() {
        return number;
    }

    /**
     *
     * @return Возвращает пробег автомобиля
     */
    public int getMileage() {
        return mileage;
    }

    /**
     *
     * @return Возвращает потребление топлива за пробег
     */
    public double getFuelConsumption() {
        return fuelConsumption;
    }

    /**
     *
     * @return Возвращает стоимость топлива за пробег
     */
    public double getFuelCost() {
        return fuelCost;
    }

    /**
     *
     * @return Возвращает объем перевезенного груза / число перевезенных пассажиров / вес поднятых грузов
     */
    public int getOther() {
        return other;
    }

    /**
     *
     * @param added - Добавляемое кол-во пробега к текущему
     */
    public void addMileage(int added) {
        mileage += added;
    }

    /**
     *
     * @param added - Добавляемое кол-во объема перевезенного груза / число перевезенных пассажиров /
     *              вес поднятых грузов к текущему
     */
    public void addOther(int added) {
        other += added;
    }

    /**
     *
     * @param car - Запись об автомобиле
     * @return возвращает признак того, что 2 записи относятся к одному автомобилю
     */
    public boolean compare(Car car) {
        boolean f;
        if (this.getNumber() == car.getNumber() && this.getCodeCar() == car.getCodeCar()) {
            f = true;
        } else {
            f = false;
        }
        return f;
    }

    /**
     * Пересчет израсходованного топлива и стоимости топлива автомобиля
     */
    public void recalculationFuelConsumptionAndFuelCost() {
        fuelConsumption = new FuelConsumption().fuelConsumption(codeCar, mileage);
        fuelCost = new FuelCost().fuelCost(codeCar, fuelConsumption);
    }

}
