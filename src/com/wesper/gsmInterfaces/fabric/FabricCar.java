package com.wesper.gsmInterfaces.fabric;

import com.wesper.gsmInterfaces.calculate.fuelConsumption.*;
import com.wesper.gsmInterfaces.calculate.fuelCost.*;
import com.wesper.gsmInterfaces.cars.*;

public class FabricCar implements Fabric{

    CalcFuelCost[] calcFuelCosts = new CalcFuelCost[4];
    CalcFuelConsumption[] calcFuelConsumptions = new CalcFuelConsumption[4];

    public void init() {
        this.calcFuelConsumptions[0] = new CalcFuelConsumptionForCar();
        this.calcFuelConsumptions[1] = new CalcFuelConsumptionForTruck();
        this.calcFuelConsumptions[2] = new CalcFuelConsumptionForPassenger();
        this.calcFuelConsumptions[3] = new CalcFuelConsumptionForHeavyCar();
        this.calcFuelCosts[0] = new CalcFuelCostForCar();
        this.calcFuelCosts[1] = new CalcFuelCostForTruck();
        this.calcFuelCosts[2] = new CalcFuelCostForPassenger();
        this.calcFuelCosts[3] = new CalcFuelCostForHeavyCar();
    }

    @Override
    public Cars createCar(int codeCar, int number, int mileage, int other) {
        Cars car;
        double fuelConsumption = 0.0;

        switch (codeCar) {
            case 100 :
                car = new Car(codeCar, number, mileage, other);
                fuelConsumption = this.calcFuelConsumptions[0].calcFuelConsumption(mileage);
                car.setFuelConsumption(fuelConsumption);
                car.setFuelCost(this.calcFuelCosts[0].calcFuelCost(fuelConsumption));
                break;
            case 200 :
                car = new Truck(codeCar, number, mileage, other);
                fuelConsumption = this.calcFuelConsumptions[1].calcFuelConsumption(mileage);
                car.setFuelConsumption(fuelConsumption);
                car.setFuelCost(this.calcFuelCosts[1].calcFuelCost(fuelConsumption));
                break;
            case 300 :
                car = new Passenger(codeCar, number, mileage, other);
                fuelConsumption = this.calcFuelConsumptions[2].calcFuelConsumption(mileage);
                car.setFuelConsumption(fuelConsumption);
                car.setFuelCost(this.calcFuelCosts[2].calcFuelCost(fuelConsumption));
                break;
            case 400 :
                car = new HeavyCar(codeCar, number, mileage, other);
                fuelConsumption = this.calcFuelConsumptions[3].calcFuelConsumption(mileage);
                car.setFuelConsumption(fuelConsumption);
                car.setFuelCost(this.calcFuelCosts[3].calcFuelCost(fuelConsumption));
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + codeCar);
        }

        return car;
    }

}
