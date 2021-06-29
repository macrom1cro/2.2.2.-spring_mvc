package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.Model.Car;
import web.Service.ServiceLisrCar;

import java.util.ArrayList;
import java.util.List;
@Controller
public class CarsController {
    @GetMapping("/cars")
    public String listCars (@RequestParam (value = "count", defaultValue = "5") int count, ModelMap model){
        List<Car> carList = new ArrayList<>();
        carList.add(new Car("Mazda",200,4));
        carList.add(new Car("Mitsubishi",250,2));
        carList.add(new Car("Volkswagen",150,4));
        carList.add(new Car("BMW",220,2));
        carList.add(new Car("Ford",190,4));
        model.addAttribute("carList", ServiceLisrCar.SortServiceLisrCar(carList,count));
        return "cars";
    }
}