package com.wesper.gsmInterfaces.storage;

import com.wesper.gsmInterfaces.cars.Car;
import com.wesper.gsmInterfaces.cars.Cars;

public class StorageCars implements Storage {

    @Override
    public double totalFuelCost(Cars[] cars) {
        double totalCost = 0.0;
        for (Cars car : cars) {
            totalCost += car.getFuelCost();
        }
        return totalCost;
    }

    @Override
    public double fuelCostByTypeOfCar(Cars[] cars, int codeCar) {
        double cost = 0.0;
        for (Cars car : cars) {
            if (car.getCodeCar() == codeCar)
                cost += car.getFuelCost();
        }
        return cost;
    }

    @Override
    public int typeOfCarWithTheHighestExpenses(Cars[] cars) {
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

    @Override
    public int typeOfCarWithTheLeastExpenses(Cars[] cars) {
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

    @Override
    public Cars[] CarsByTypeOfCarSortMileage(Cars[] cars, int codeCar) {
        Cars[] carsByType = new Cars[0];
        sortMileage(cars);
        for (Cars car : cars) {
            if (car.getCodeCar() == codeCar){
                carsByType = put(carsByType, car);
            }
        }

        return carsByType;
    }

    @Override
    public Cars[] CarsByTypeOfCarSortOther(Cars[] cars, int codeCar) {
        Cars[] carsByOther = new Cars[0];
        sortOther(cars);
        for (Cars car : cars) {
            if (car.getCodeCar() == codeCar){
                carsByOther = put(carsByOther, car);
            }
        }

        return carsByOther;
    }

    @Override
    public Cars[] sortMileage(Cars[] cars) {
        Cars tmp;
        int min;
        for (int i = 0; i < cars.length-1;i++) {
            min = i;
            for (int j = i + 1; j < cars.length; j++) {
                if (cars[j].getMileage() < cars[min].getMileage())
                    min = j;
            }
            tmp = cars[min];
            cars[min] = cars[i];
            cars[i] = tmp;
        }

        return cars;
    }

    @Override
    public Cars[] sortOther(Cars[] cars) {
        Cars tmp;
        int min;
        for (int i = 0; i < cars.length-1;i++) {
            min = i;
            for (int j = i + 1; j < cars.length; j++) {
                if (cars[j].getOther() < cars[min].getOther())
                    min = j;
            }
            tmp = cars[min];
            cars[min] = cars[i];
            cars[i] = tmp;
        }

        return cars;
    }

    @Override
    public Cars[] collapseCars(Cars[] cars) {
        int arrNotNullLength = 0;
        for (int i = 0; i < cars.length - 1; i++) {
            for (int j = i + 1; j < cars.length; j++) {
                if (cars[i] != null && cars[j] != null && compare(cars[i], cars[j])) {
                    cars[i].setOther(cars[i].getOther() + cars[j].getOther());
                    cars[i].setMileage(cars[i].getMileage() + cars[j].getMileage());
                    cars[i].setFuelCost(cars[i].getFuelCost() + cars[j].getFuelCost());
                    cars[i].setFuelConsumption(cars[i].getFuelConsumption() + cars[j].getFuelConsumption());
                    cars[j] = null;
                }
            }
        }

        for (Cars car : cars) {
            if (car != null)
                arrNotNullLength++;
        }

        Cars[] newCars = new Cars[arrNotNullLength];
        int j = 0;
        for (int i = 0; i < cars.length; i++) {
            if (cars[i] != null) {
                newCars[j] = cars[i];
                j++;
            }
        }
        return newCars;
    }

    @Override
    public boolean compare(Cars car1, Cars car2) {
        boolean f = false;
        if (car1.getCodeCar() == car2.getCodeCar() && car1.getNumber() == car2.getNumber()) {
            f = true;
        }

        return f;
    }

}
