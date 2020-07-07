package com.wesper.gsmInterfaces.storage;

import com.wesper.gsmInterfaces.cars.Cars;

public interface Storage {

    /**
     * @param cars - массив записей об автомобилях
     * @return возвращает общую стоимость топлива всех автомобилей
     */
    double totalFuelCost(Cars[] cars);

    /**
     * @param cars    - массив записей об автомобилях
     * @param codeCar - код типа автомобиля
     * @return возвращает стоимость топлива всех автомобилей указанного типа
     */
    double fuelCostByTypeOfCar(Cars[] cars, int codeCar);

    /**
     * @param cars - массив записей об автомобилях
     * @return возвращает тип автомобилей, потративших больше всех денег на топливо
     */
    int typeOfCarWithTheHighestExpenses(Cars[] cars);

    /**
     * @param cars - массив записей об автомобилях
     * @return возвращает тип автомобилей, потративших меньше всех денег на топливо
     */
    int typeOfCarWithTheLeastExpenses(Cars[] cars);

    /**
     * @param cars - массив записей об автомобилях
     * @return Возвращает автомобили переданного типа с сортировкой по пробегу
     */
    Cars[] CarsByTypeOfCarSortMileage(Cars[] cars, int codeCar);

    /**
     *
     * @param cars - массив записей об автомобилях
     * @return Возвращает автомобили переданного типа с сортировкой по прочему параметру
     */
    Cars[] CarsByTypeOfCarSortOther(Cars[] cars, int codeCar);

    /**
     *
     * @param cars - массив записей об автомобилях
     * @return Возвращает отсортированный массив автомобилей по пробегу
     */
    Cars[] sortMileage(Cars[] cars);

    /**
     *
     * @param cars - массив записей об автомобилях
     * @return Возвращает отсортированный массив автомобилей по прочему параметру
     */
    Cars[] sortOther(Cars[] cars);

    /**
     *
     * @param cars - массив записей об автомобилях
     * @param car - автомобиль для добавления в массив
     * @return возвращает новый массив с добавленным автомобилем
     */
    default Cars[] put(Cars[] cars, Cars car) {
        Cars[] newCars = new Cars[cars.length + 1];
        int i = 0;
        for (Cars value: cars) {
            newCars[i] = value;
            i++;
        }
        newCars[cars.length] = car;

        return newCars;
    };

    /**
     *
     * @param cars - массив записей об автомобилях
     * @return возвращает схлопнутый массив по коду и номеру автомобиля
     */
    Cars[] collapseCars(Cars[] cars);

    /**
     *
     * @param car1 - автомобиль 1
     * @param car2 - автомобиль 2
     * @return возвращает результат сравнения автомобилей по коду и номеру
     */
    boolean compare(Cars car1, Cars car2);
}
