package com.wesper.gsmInterfaces.print;

import com.wesper.gsmInterfaces.cars.Cars;

public class PrintInfo implements Print{
    @Override
    public void printInfo(Cars cars) {
        System.out.println("##########");
        System.out.println("Автомобиль " + cars.getCodeCar());
        System.out.println("Гос. номер " + cars.getNumber());
        System.out.println("Пробег в км " + cars.getMileage());
        System.out.println("Прочий параметр " + cars.getOther());
        System.out.println("Использовано топлива в литрах " + cars.getFuelConsumption());
        System.out.println("Потрачено денег на топливо " + cars.getFuelCost());
    }

    @Override
    public void printInfo(Cars[] cars) {
        System.out.println("##########");
        for (Cars cars1 : cars) {
            System.out.println("Автомобиль " + cars1.getCodeCar());
            System.out.println("Гос. номер " + cars1.getNumber());
            System.out.println("Пробег в км " + cars1.getMileage());
            System.out.println("Прочий параметр " + cars1.getOther());
            System.out.println("Использовано топлива в литрах " + cars1.getFuelConsumption());
            System.out.println("Потрачено денег на топливо " + cars1.getFuelCost());
            System.out.println();
        }
    }

    @Override
    public void printInfo(String str, Cars cars) {
        System.out.println("##########");
        System.out.println(str);
        System.out.println("Автомобиль " + cars.getCodeCar());
        System.out.println("Гос. номер " + cars.getNumber());
        System.out.println("Пробег в км " + cars.getMileage());
        System.out.println("Прочий параметр " + cars.getOther());
        System.out.println("Использовано топлива в литрах " + cars.getFuelConsumption());
        System.out.println("Потрачено денег на топливо " + cars.getFuelCost());
    }

    @Override
    public void printInfo(String str, Cars[] cars) {
        System.out.println("##########");
        System.out.println(str);
        for (Cars cars1 : cars) {
            System.out.println("Автомобиль " + cars1.getCodeCar());
            System.out.println("Гос. номер " + cars1.getNumber());
            System.out.println("Пробег в км " + cars1.getMileage());
            System.out.println("Прочий параметр " + cars1.getOther());
            System.out.println("Использовано топлива в литрах " + cars1.getFuelConsumption());
            System.out.println("Потрачено денег на топливо " + cars1.getFuelCost());
            System.out.println();
        }
    }

    @Override
    public void printInfo(String str, double value) {
        System.out.println("##########");
        System.out.println(str);
        System.out.println(value);
    }

    @Override
    public void printInfo(String str, int value) {
        System.out.println("##########");
        System.out.println(str);
        System.out.println(value);
    }
}
