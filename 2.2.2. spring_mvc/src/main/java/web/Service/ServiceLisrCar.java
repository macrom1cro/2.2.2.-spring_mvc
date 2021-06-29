package web.Service;

import web.Model.Car;

import java.util.ArrayList;
import java.util.List;

public class ServiceLisrCar {

    public static List<Car> SortServiceLisrCar(List<Car> carList, int n){
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
