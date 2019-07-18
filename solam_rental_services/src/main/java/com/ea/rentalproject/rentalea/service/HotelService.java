package com.ea.rentalproject.rentalea.service;

import com.ea.rentalproject.rentalea.domain.Hotel;
import com.ea.rentalproject.rentalea.repository.HotelRepository;
import org.springframework.stereotype.Service;


import javax.annotation.Resource;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
@Transactional
public class HotelService  {


    @Resource
    private HotelRepository repo;


    public List<Hotel> getAll() {
        return repo.findAll();
    }


    public Hotel add(Hotel hotel) {
        return repo.save(hotel);
    }


    public Hotel getById(long id) {
        return repo.getOne(id);
    }

    public Hotel update(Hotel hotel) {
        return repo.save(hotel);
    }

    public Hotel updateRent(Hotel hotel){
        return repo.save(hotel);
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }

    public List<Hotel> getAllFilteredCar(String zip, Double min1, Double max1) {
        return repo.getAllFilteredHotel(zip,min1,max1);
    }
}
