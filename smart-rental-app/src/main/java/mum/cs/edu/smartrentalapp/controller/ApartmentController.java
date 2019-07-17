package mum.cs.edu.smartrentalapp.controller;

import mum.cs.edu.smartrentalapp.domain.apartment.Apartment;
import mum.cs.edu.smartrentalapp.service.ApartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.List;

@Controller
public class ApartmentController {
    @Autowired
    private ApartmentService apartmentService;

    @GetMapping("/showCategoryDetail")
    public String showCategoryDetail(Model model){
        List<Apartment> apartmentList= apartmentService.getApartments();
        model.addAttribute("apartments",apartmentList);
        model.addAttribute("category","");
        return "views/home/accesoriesTable";

    }
    @GetMapping("/showDetail")
    public String showDetail(@ModelAttribute("category") String category, Model model){
        List<Apartment> apartmentList= apartmentService.getApartments();
        model.addAttribute("apartments",apartmentList);
        System.out.println("category clicked =="+ category);
        return "views/home/accesoriesTable";

    }

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ApartmentController {


    @GetMapping("/available/apartment/")
    public String carsList(Model model){
//        List<Mycar> cars = carService.getAll();
//        model.addAttribute("cars",cars);
        return "test";
    }
}
