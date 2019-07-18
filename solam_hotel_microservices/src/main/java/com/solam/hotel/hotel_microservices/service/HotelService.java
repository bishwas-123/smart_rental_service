package com.solam.hotel.hotel_microservices.service;


import com.solam.hotel.hotel_microservices.domain.Hotel;
import com.solam.hotel.hotel_microservices.domain.SearchFilter;

import java.util.List;

public interface HotelService  {


    List<Hotel> getAll();
    List<Hotel> filterList(SearchFilter filter);
    Hotel getOne(long id);
}
