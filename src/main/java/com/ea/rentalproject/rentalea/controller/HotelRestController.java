package com.ea.rentalproject.rentalea.controller;


import com.ea.rentalproject.rentalea.domain.Hotel;
import com.ea.rentalproject.rentalea.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class HotelRestController {



    @Autowired
    private HotelService service;

    @GetMapping("/hotels")
    public List<Hotel> getAll(){
        return service.getAll();
    }

    @PostMapping("/addHotel")
    public Hotel addHotel(@RequestBody Hotel hotel){
        return service.add(hotel);
    }

    @GetMapping("/hotel/{id}")
    public Hotel getHotel(@PathVariable long id){
        return service.getById(id);
    }






}
