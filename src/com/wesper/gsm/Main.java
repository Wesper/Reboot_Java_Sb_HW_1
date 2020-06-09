package com.wesper.gsm;

public class Main {

    public static void main(String[] args) {

        final String[] INPUT = new String[]{
                "C100_1-100", "C200_1-120-1200", "C300_1-120-30",
                "C400_1-80-20", "C100_2-50", "C200_2-40-1000",
                "C300_2-200-45", "C400_2-10-20", "C100_3-10",
                "C200_3-170-1100", "C300_3-150-29", "C400_3-100-28",
                "C100_1-300", "C200_1-100-750", "C300_1-32-15"
        };

        Car[] cars = new Car[INPUT.length];

        for (int i = 0; i < INPUT.length; i++) {
            cars[i] = new Car(new ArrayUtils().parse(INPUT[i]));
        }

        cars = new ArrayUtils().collapse(cars);

        System.out.println("Общая стоимость расходов на ГСМ " +
                new Statistics().totalFuelCost(cars));
        System.out.println("Стоимость ГСМ на автомобили класса 100 " +
                new Statistics().fuelCostByTypeOfCar(cars, 100));
        System.out.println("Стоимость ГСМ на автомобили класса 200 " +
                new Statistics().fuelCostByTypeOfCar(cars, 200));
        System.out.println("Стоимость ГСМ на автомобили класса 300 " +
                new Statistics().fuelCostByTypeOfCar(cars, 300));
        System.out.println("Стоимость ГСМ на автомобили класса 400 " +
                new Statistics().fuelCostByTypeOfCar(cars, 400));
        System.out.println("Тип автомобиля, имеющий наибольшие затраты на ГСМ " +
                new Statistics().typeOfCarWithTheHighestExpenses(cars));
        System.out.println("Тип автомобиля, имеющий наименьшие затраты на ГСМ " +
                new Statistics().typeOfCarWithTheLeastExpenses(cars));

        System.out.println();

        System.out.println("Информация об автомобилях типа 100 с сортировкой по пробегу");
        new Statistics().printInfoByTypeOfCarSortMileage(cars, 100);

        System.out.println();

        System.out.println("Информация об автомобилях типа 200 с сортировкой по пробегу");
        new Statistics().printInfoByTypeOfCarSortMileage(cars, 200);

        System.out.println();

        System.out.println("Информация об автомобилях типа 300 с сортировкой по пробегу");
        new Statistics().printInfoByTypeOfCarSortMileage(cars, 300);

        System.out.println();

        System.out.println("Информация об автомобилях типа 400 с сортировкой по пробегу");
        new Statistics().printInfoByTypeOfCarSortMileage(cars, 400);

        System.out.println();

        System.out.println("Информация об автомобилях типа 100 с сортировкой по прочему параметру");
        new Statistics().printInfoByTypeOfCarSortOther(cars, 100);

        System.out.println();

        System.out.println("Информация об автомобилях типа 200 с сортировкой по прочему параметру");
        new Statistics().printInfoByTypeOfCarSortOther(cars, 200);

        System.out.println();

        System.out.println("Информация об автомобилях типа 300 с сортировкой по прочему параметру");
        new Statistics().printInfoByTypeOfCarSortOther(cars, 300);

        System.out.println();

        System.out.println("Информация об автомобилях типа 400 с сортировкой по прочему параметру");
        new Statistics().printInfoByTypeOfCarSortOther(cars, 400);
    }
}
