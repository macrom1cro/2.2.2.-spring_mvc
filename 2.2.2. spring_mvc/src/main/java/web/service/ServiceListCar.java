package web.service;

import web.model.Car;

import java.util.List;

public interface ServiceListCar {
    void addListCar(Car car);
    List<Car> sortListCar(int n);
}
