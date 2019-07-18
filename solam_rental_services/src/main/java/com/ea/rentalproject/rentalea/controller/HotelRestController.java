package com.ea.rentalproject.rentalea.controller;


import com.ea.rentalproject.rentalea.domain.Hotel;
import com.ea.rentalproject.rentalea.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class HotelRestController {



    @Autowired
    private HotelService service;

    @GetMapping(value="/hotels")
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

    @PutMapping("/hotelUpdate/{id}")
    public void update(@RequestBody Hotel hotel) {
        service.update(hotel);
    }

    @DeleteMapping("/hotelDelete/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }


    @GetMapping("/filteredHotels/{zip}/{min}/{max}")
    public List<Hotel> getAllFilteredHotel(Model model, @PathVariable String zip, @PathVariable String min, @PathVariable String max){
        Double min1=new Double(min);
        Double max1=new Double(max);
        return service.getAllFilteredCar(zip,min1,max1);
    }

    @PutMapping("/hotel/rent/{id}")
    public void rentUpdate(@RequestBody Hotel hotel) {
        service.update(hotel);
    }








}
