package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.ServiceListCar;

@Controller
public class CarsController {
    @Autowired
    ServiceListCar serviceListCar;
    @GetMapping("/cars")
    public String listCars (@RequestParam (value = "count", defaultValue = "5") int count, ModelMap model){
        serviceListCar.addListCar(new Car("Mazda",200,4));
        serviceListCar.addListCar(new Car("Mitsubishi",250,2));
        serviceListCar.addListCar(new Car("Volkswagen",150,4));
        serviceListCar.addListCar(new Car("BMW",220,2));
        serviceListCar.addListCar(new Car("Ford",190,4));
        model.addAttribute("carList", serviceListCar.sortListCar(count));
        return "cars";
    }
}
