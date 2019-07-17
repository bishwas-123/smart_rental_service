package mum.cs.edu.smartrentalapp.controller;

import mum.cs.edu.smartrentalapp.domain.apartment.Apartment;
import mum.cs.edu.smartrentalapp.domain.user.User;
import mum.cs.edu.smartrentalapp.service.ApartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class CrudController {
    @Autowired
    private ApartmentService apartmentService;

    @GetMapping("/addApartment")
    public String showNewForm(Model model) {
        model.addAttribute("apartment", new Apartment());
        return "views/home/apartment-form";
    }

    @PostMapping("/add-apartment")
    public String addApartment(Apartment apartment, Model model, HttpSession session){
//        User user = (User) session.getAttribute("user");
//        apartment.setVendorId(user.getId());
        apartmentService.save(apartment);
        List<Apartment> apartmentList = apartmentService.getApartments();
        model.addAttribute("apartments", apartmentList);
        return "views/home/accesoriesTable";

    }
    @GetMapping("/edit/{id}")
    public String showUpdateForm(@PathVariable("id") long id, Model model) {
        Apartment apartment = apartmentService.get(id);
        model.addAttribute("apartment", apartment);
        return "update-apartment";
    }

    @PostMapping("/update/{id}")
    public String updateApartment(@PathVariable("id") long id, Apartment apartment, BindingResult result,
                            Model model) {
        if (result.hasErrors()) {
            apartment.setId(id);
            return "update-apartment";
        } else {
            apartmentService.save(apartment);
            model.addAttribute("apartments", apartmentService.getApartments());
            return "views/home/accesoriesTable";
        }
    }
    @GetMapping("/delete/{id}")
    public String deleteApartment(@PathVariable("id") long id, Model model) {
        apartmentService.delete(id);
        model.addAttribute("apartments", apartmentService.getApartments());
        return "views/home/accesoriesTable";
    }
}
