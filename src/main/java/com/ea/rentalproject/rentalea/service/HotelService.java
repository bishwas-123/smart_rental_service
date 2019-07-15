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
}
