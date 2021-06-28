package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import web.Model.Car;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;
@Controller
public class CarsController {
    @GetMapping("/cars")
    public String listCars (@RequestParam (value = "count", required = false, defaultValue = "5") int count){
        List<String> messages = new ArrayList<>();
        messages.add("Hello!");
        messages.add("I'm Spring MVC application");
        messages.add("5.2.0 version by sep'19 ");
        model.addAttribute("messages", messages);
        return "cars";
    }
//                            ModelMap model)
//    public String listCars (@ModelAttribute("mvc-dispatcher") Car car,
//                            ModelMap model) {
//        model.addAttribute("brand", car.getBrand());
//        model.addAttribute("MaxSpeed", car.getMaxSpeed());
//        model.addAttribute("NumberOfSeats", car.getNumberOfSeats());
//        return "cars";
//    }
}
