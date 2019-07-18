package mum.cs.edu.smartrentalapp.controller;

import mum.cs.edu.smartrentalapp.domain.Mycar;
import mum.cs.edu.smartrentalapp.domain.SearchFIlter;
import mum.cs.edu.smartrentalapp.domain.rent.Payment;
import mum.cs.edu.smartrentalapp.domain.rent.Rent;
import mum.cs.edu.smartrentalapp.service.MyCarService;
import mum.cs.edu.smartrentalapp.service.RentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.context.request.WebRequest;

import javax.servlet.http.HttpSession;
import java.time.LocalDate;
import java.util.List;

import static java.time.temporal.ChronoUnit.DAYS;

@Controller
public class RentController {
    @Autowired
    RentService rentService;

@PostMapping("/rentItem")
public String rentItemFind(Model model, @ModelAttribute Rent rent, HttpSession session){
    if(session.getAttribute("user")!=null){
        LocalDate start=rent.getRentFrom();

        LocalDate end =rent.getRentTo();
        long daysBetween = DAYS.between(start, end);

        double total_price=daysBetween*rent.getPrice();
        System.out.println("TOTAL PRICEEEEEEEEEEEEEEEEEEEEEEEE"+total_price);
        model.addAttribute("total_price",total_price);
        model.addAttribute("rent",rentService.add(rent));
        model.addAttribute("payment",new Payment());
        return "views/rent/payment";
    }
    else{
        return "redirect:/login";
    }

}


    @PostMapping("/makePayment")
    public String makePayment(Model model, @ModelAttribute Payment payment, HttpSession session){
        if(session.getAttribute("user")!=null){

//            double total_price=daysBetween*rent.getPrice();
//            System.out.println("TOTAL PRICEEEEEEEEEEEEEEEEEEEEEEEE"+total_price);
//            model.addAttribute("total_price",total_price);
            model.addAttribute("rent",rentService.add(payment));
            return "redirect:/home";
        }
        else{
            return "redirect:/login";
        }

    }



    @GetMapping("/searchItem")
    public String searchCategory(){
        return "views/cars/serachResult";
    }







}
