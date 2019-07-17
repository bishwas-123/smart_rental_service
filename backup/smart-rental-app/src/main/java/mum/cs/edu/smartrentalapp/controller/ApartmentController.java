package mum.cs.edu.smartrentalapp.controller;

import mum.cs.edu.smartrentalapp.domain.Mycar;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
@Controller
public class ApartmentController {


    @GetMapping("/available/apartment/")
    public String carsList(Model model){
//        List<Mycar> cars = carService.getAll();
//        model.addAttribute("cars",cars);
        return "views/cars/carList";
    }
}
