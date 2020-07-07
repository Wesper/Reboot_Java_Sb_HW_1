package com.wesper.gsmInterfaces.fabric;

import com.wesper.gsmInterfaces.calculate.fuelConsumption.*;
import com.wesper.gsmInterfaces.calculate.fuelCost.*;
import com.wesper.gsmInterfaces.cars.*;

public class FabricCar implements Fabric{

    CalcFuelConsumption calcFuelConsumption;
    CalcFuelCost calcFuelCost;

    @Override
    public Cars createCar(int codeCar, int number, int mileage, int other) {
        Cars car;
        double fuelConsumption;

        switch (codeCar) {
            case 100 :
                car = new Car(codeCar, number, mileage, other);
                this.calcFuelConsumption = new CalcFuelConsumptionForCar();
                this.calcFuelCost = new CalcFuelCostForCar();
                fuelConsumption = calcFuelConsumption(mileage);
                car.setFuelConsumption(fuelConsumption);
                car.setFuelCost(calcFuelCost(fuelConsumption));
                break;
            case 200 :
                car = new Truck(codeCar, number, mileage, other);
                this.calcFuelConsumption = new CalcFuelConsumptionForTruck();
                this.calcFuelCost = new CalcFuelCostForTruck();
                fuelConsumption = calcFuelConsumption(mileage);
                car.setFuelConsumption(fuelConsumption);
                car.setFuelCost(calcFuelCost(fuelConsumption));
                break;
            case 300 :
                car = new Passenger(codeCar, number, mileage, other);
                this.calcFuelConsumption = new CalcFuelConsumptionForPassenger();
                this.calcFuelCost = new CalcFuelCostForPassenger();
                fuelConsumption = calcFuelConsumption(mileage);
                car.setFuelConsumption(fuelConsumption);
                car.setFuelCost(calcFuelCost(fuelConsumption));
                break;
            case 400 :
                car = new HeavyCar(codeCar, number, mileage, other);
                this.calcFuelConsumption = new CalcFuelConsumptionForHeavyCar();
                this.calcFuelCost = new CalcFuelCostForHeavyCar();
                fuelConsumption = calcFuelConsumption(mileage);
                car.setFuelConsumption(fuelConsumption);
                car.setFuelCost(calcFuelCost(fuelConsumption));
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + codeCar);
        }

        return car;
    }

    @Override
    public double calcFuelConsumption(int mileage) {
        return calcFuelConsumption.calcFuelConsumption(mileage);
    }

    @Override
    public double calcFuelCost(double fuelConsumption) {
        return calcFuelCost.calcFuelCost(fuelConsumption);
    }

}
