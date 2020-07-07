package com.wesper.gsmInterfaces.print;

import com.wesper.gsmInterfaces.cars.Cars;

public interface Print {

    void printInfo(Cars cars);

    void printInfo(Cars[] cars);

    void printInfo(String str, Cars cars);

    void printInfo(String str, Cars[] cars);

    void printInfo(String str, double value);
    void printInfo(String str, int value);
}
