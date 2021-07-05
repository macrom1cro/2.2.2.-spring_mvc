package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class ServiceListCarImpl implements ServiceListCar {
    private List<Car> carList = new ArrayList<>();

    public void addListCar(Car car) {
        carList.add(car);
    }

    public List<Car> sortListCar(int n){
        List<Car> sortCarList = new ArrayList<>();
        if (n > 5) {
            n = 5;
        }
        for (int i=0; i <= (n -1); i++){
            sortCarList.add(i, carList.get(i));
        }
        return sortCarList;
    }
}
