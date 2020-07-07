package com.wesper.gsmInterfaces;

import com.wesper.gsmInterfaces.cars.Cars;
import com.wesper.gsmInterfaces.parser.ParserCars;
import com.wesper.gsmInterfaces.print.PrintInfo;
import com.wesper.gsmInterfaces.storage.StorageCars;

public class Orchestration {

    protected Orchestration() {
    }

    public void start(String[] input) {
        Cars[] parserCars = new ParserCars().parse(input);
        StorageCars storageCars = new StorageCars();
        parserCars = storageCars.collapseCars(parserCars);
        PrintInfo printInfo = new PrintInfo();
        printInfo.printInfo("Общая стоимость топлива всех автомобилей",
                storageCars.totalFuelCost(parserCars));
        printInfo.printInfo("Общая стоимость топлива всех автомобилей типа 100",
                storageCars.fuelCostByTypeOfCar(parserCars, 100));
        printInfo.printInfo("Общая стоимость топлива всех автомобилей типа 200",
                storageCars.fuelCostByTypeOfCar(parserCars, 200));
        printInfo.printInfo("Общая стоимость топлива всех автомобилей типа 300",
                storageCars.fuelCostByTypeOfCar(parserCars, 300));
        printInfo.printInfo("Общая стоимость топлива всех автомобилей типа 400",
                storageCars.fuelCostByTypeOfCar(parserCars, 400));
        printInfo.printInfo("Тип автомобилей, потративших больше всех денег на топливо",
                storageCars.typeOfCarWithTheHighestExpenses(parserCars));
        printInfo.printInfo("Тип автомобилей, потративших меньше всех денег на топливо",
                storageCars.typeOfCarWithTheLeastExpenses(parserCars));
        printInfo.printInfo("Автомобили типа 100 с сортировкой по пробегу",
                storageCars.CarsByTypeOfCarSortMileage(parserCars, 100));
        printInfo.printInfo("Автомобили типа 200 с сортировкой по пробегу",
                storageCars.CarsByTypeOfCarSortMileage(parserCars, 200));
        printInfo.printInfo("Автомобили типа 300 с сортировкой по пробегу",
                storageCars.CarsByTypeOfCarSortMileage(parserCars, 300));
        printInfo.printInfo("Автомобили типа 400 с сортировкой по пробегу",
                storageCars.CarsByTypeOfCarSortMileage(parserCars, 400));
        printInfo.printInfo("Автомобили типа 100 с сортировкой по прочему параметру",
                storageCars.CarsByTypeOfCarSortOther(parserCars, 100));
        printInfo.printInfo("Автомобили типа 200 с сортировкой по прочему параметру",
                storageCars.CarsByTypeOfCarSortOther(parserCars, 200));
        printInfo.printInfo("Автомобили типа 300 с сортировкой по прочему параметру",
                storageCars.CarsByTypeOfCarSortOther(parserCars, 300));
        printInfo.printInfo("Автомобили типа 400 с сортировкой по прочему параметру",
                storageCars.CarsByTypeOfCarSortOther(parserCars, 400));
        printInfo.printInfo("Отсортированный массив всех автомобилей по пробегу",
                storageCars.sortMileage(parserCars));
        printInfo.printInfo("Отсортированный массив всех автомобилей по прочему параметру",
                storageCars.sortOther(parserCars));
    }
}
