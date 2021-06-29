package web.Service;

import web.Model.Car;

import java.util.ArrayList;
import java.util.List;

public class ServiceLisrCar {

    public static List<Car> SortServiceLisrCar(List<Car> carList, int n){
        List<Car> sortCarList = new ArrayList<>();
        n = n - 1;
        if (n > 4) {
            n = 4;
        }
        for (int i=0; i<=n; i++){
            sortCarList.add(i, carList.get(i));
        }
        return sortCarList;
    }
}
