package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarServiceImp;


@Controller
public class CarsController {
    @Autowired
    private CarServiceImp carServiceImp;

    @GetMapping(value = "/cars")
    public String printCars(@RequestParam(value = "count", required = false) Integer num, Model model) {
        model.addAttribute("carList", carServiceImp.getCountCar(num));
        return "cars";
    }

}
