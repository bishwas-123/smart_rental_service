package mum.cs.edu.smartrentalapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomePageController {
    @RequestMapping(value={"/", "/rental", "smart_rental","smartRental", "smart_rental_service", "home"},
            method= RequestMethod.GET)
    public String homepage() {
        return "views/home/index";
    }



}
