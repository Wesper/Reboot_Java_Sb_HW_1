package com.wesper.gsm;

public class ArrayUtils {

    /**
     *
     * @param data - строка с записью об автомобиле
     * @return возвращает массив параметров автомобиля
     */
    public int[] parse(String data) {
        String[] splitData = data.split("\\D");
        int[] parsedArray = new int[splitData.length - 1];
        for (int i = 0; i < parsedArray.length; i++) {
            parsedArray[i] = Integer.parseInt(splitData[i + 1]);
        }
        return parsedArray;
    }

    /**
     *
     * @param cars - массив объектов автомобилей
     * @return возвращает схлопнутый по коду и номеру автомобилей массив
     */
    public Car[] collapse(Car[] cars) {
        int arrNotNullLength = 0;
        for (int i = 0; i < cars.length - 1; i++) {
            for (int j = i + 1; j < cars.length; j++) {
                if (cars[i] != null && cars[j] != null && cars[i].compare(cars[j])) {
                    cars[i].addOther(cars[j].getOther());
                    cars[i].addMileage(cars[j].getMileage());
                    cars[i].recalculationFuelConsumptionAndFuelCost();
                    cars[j] = null;
                }
            }
        }

        for (Car car : cars) {
            if (car != null)
                arrNotNullLength++;
        }

        Car[] newCars = new Car[arrNotNullLength];
        int j = 0;
        for (int i = 0; i < cars.length; i++) {
            if (cars[i] != null) {
                newCars[j] = cars[i];
                j++;
            }
        }
        return newCars;
    }
}
