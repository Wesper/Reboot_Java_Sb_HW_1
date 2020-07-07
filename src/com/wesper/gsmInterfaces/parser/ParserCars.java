package com.wesper.gsmInterfaces.parser;

import com.wesper.gsmInterfaces.cars.Cars;
import com.wesper.gsmInterfaces.fabric.FabricCar;

public class ParserCars implements Parser {
    @Override
    public Cars[] parse(String[] input) {
        int i = 0;
        Cars[] cars = new Cars[input.length];
        FabricCar fabricCar = new FabricCar();
        fabricCar.init();
        for (String str : input) {
            String[] splited = str.split("\\D");
            int codeCar = Integer.parseInt(splited[1]);
            int number = Integer.parseInt(splited[2]);
            int mileage = Integer.parseInt(splited[3]);
            int other = 0;
            if (splited.length >= 5) {
                other = Integer.parseInt(splited[4]);
            }
            cars[i] = fabricCar.createCar(codeCar, number, mileage, other);
            i++;
        }

        return cars;
    }
}
