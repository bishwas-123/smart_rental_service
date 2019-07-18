package com.solam.hotel.hotel_microservices.controller;



import com.solam.hotel.hotel_microservices.domain.Hotel;
import com.solam.hotel.hotel_microservices.domain.SearchFilter;
import com.solam.hotel.hotel_microservices.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class HotelController {



    @Autowired
    private HotelService service;

    @GetMapping("/hotels")
    public String hotelList(Model model, HttpSession session){
        if(session.getAttribute("filter")!=null){
            SearchFilter filter = (SearchFilter) session.getAttribute("filter");
            List<Hotel> hotels = service.filterList(filter);
            if (hotels.isEmpty()) {
                model.addAttribute("msg","No Such Result Found !");

            }
            else{
                model.addAttribute("hotels",hotels);
            }
        }
        return "/hotellist";
    }

    @GetMapping("/viewHotel/{id}")
    public String singleHotel(Model model, @PathVariable Long id){
        Hotel hotel=service.getOne(id);
        model.addAttribute("hotel",hotel);
        return "getHotel";

    }
}
