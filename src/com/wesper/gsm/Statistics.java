package com.wesper.gsm;

import java.util.Enumeration;

public class Statistics {

    /**
     *
     * @param cars - массив записей об автомобилях
     * @return возвращает общую стоимость топлива всех автомобилей
     */
    public double totalFuelCost(Car[] cars) {
        double totalCost = 0.0;
        for (Car car : cars) {
            totalCost += car.getFuelCost();
        }
        return totalCost;
    }

    /**
     *
     * @param cars - массив записей об автомобилях
     * @param codeCar - код типа автомобиля
     * @return возвращает стоимость топлива всех автомобилей указанного типа
     */
    public double fuelCostByTypeOfCar(Car[] cars, int codeCar) {
        double cost = 0.0;
        for (Car car : cars) {
            if (car.getCodeCar() == codeCar)
                cost += car.getFuelCost();
        }
        return cost;
    }

    /**
     *
     * @param cars - массив записей об автомобилях
     * @return возвращает тип автомобилей, потративших больше всех денег на топливо
     */
    public int typeOfCarWithTheHighestExpenses(Car[] cars) {

        double[][] fuelCostByTypeOfCar = new double[][]{
            {100, fuelCostByTypeOfCar(cars, 100)},
            {200, fuelCostByTypeOfCar(cars, 200)},
            {300, fuelCostByTypeOfCar(cars, 300)},
            {400, fuelCostByTypeOfCar(cars, 400)}
        };

        int max = (int)fuelCostByTypeOfCar[0][0];
        for (int i = 0; i < fuelCostByTypeOfCar.length - 1; i++) {
            if (fuelCostByTypeOfCar[i][1] < fuelCostByTypeOfCar[i + 1][1])
                max = (int)fuelCostByTypeOfCar[i + 1][0];
        }
        return max;
    }

    /**
     *
     * @param cars - массив записей об автомобилях
     * @return возвращает тип автомобилей, потративших меньше всех денег на топливо
     */
    public int typeOfCarWithTheLeastExpenses(Car[] cars) {

        double[][] fuelCostByTypeOfCar = new double[][]{
                {100, fuelCostByTypeOfCar(cars, 100)},
                {200, fuelCostByTypeOfCar(cars, 200)},
                {300, fuelCostByTypeOfCar(cars, 300)},
                {400, fuelCostByTypeOfCar(cars, 400)}
        };

        int min = (int)fuelCostByTypeOfCar[0][0];
        for (int i = 0; i < fuelCostByTypeOfCar.length - 1; i++) {
            if (fuelCostByTypeOfCar[i][1] > fuelCostByTypeOfCar[i + 1][1])
                min = (int)fuelCostByTypeOfCar[i + 1][0];
        }
        return min;
    }

    /**
     *
     * @param cars - массив записей об автомобилях
     * Вывод информации обо всех автомобилях в разрезе типа автомобиля с сортировкой по пробегу
     */
    public void printInfoByTypeOfCarSortMileage(Car[] cars, int codeCar) {
        sortMileage(cars);
        for (Car car : cars) {
            if (car.getCodeCar() == codeCar){
                printInfo(car);
            }
        }
    }

    /**
     *
     * @param cars - массив записей об автомобилях
     * Вывод информации обо всех автомобилях в разрезе типа автомобиля с сортировкой по пробегу
     */
    public void printInfoByTypeOfCarSortOther(Car[] cars, int codeCar) {
        sortOther(cars);
        for (Car car : cars) {
            if (car.getCodeCar() == codeCar){
                printInfo(car);
            }
        }
    }

    /**
     *
     * @param cars - массив записей об автомобилях
     * Возвращает отсортированный массив автомобилей по пробегу
     */
    public void sortMileage(Car[] cars) {
        Car tmp;
        int min;
        for (int i = 0; i < cars.length-1;i++) {
            min = i;
            for (int j = i + 1; j < cars.length; j++) {
                if (cars[j].getMileage() < cars[i].getMileage())
                    min = j;
            }
            tmp = cars[min];
            cars[min] = cars[i];
            cars[i] = tmp;
        }
    }

    /**
     *
     * @param cars - массив записей об автомобилях
     * Возвращает отсортированный массив автомобилей по прочему параметру
     */
    public void sortOther(Car[] cars) {
        Car tmp;
        int min;
        for (int i = 0; i < cars.length-1;i++) {
            min = i;
            for (int j = i + 1; j < cars.length; j++) {
                if (cars[j].getOther() < cars[i].getOther())
                    min = j;
            }
            tmp = cars[min];
            cars[min] = cars[i];
            cars[i] = tmp;
        }
    }

    public void printInfo(Car car) {
        System.out.println("----------");
        System.out.println("Автомобиль " + car.getCodeCar());
        System.out.println("Гос. номер " + car.getNumber());
        System.out.println("Пробег в км " + car.getMileage());
        System.out.println("Прочий параметр " + car.getOther());
        System.out.println("Использовано топлива в литрах " + car.getFuelConsumption());
        System.out.println("Потрачено денег на топливо " + car.getFuelCost());
    }
}