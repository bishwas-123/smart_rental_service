package com.solam.hotel.hotel_microservices.service;


import com.solam.hotel.hotel_microservices.domain.Hotel;
import com.solam.hotel.hotel_microservices.domain.SearchFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class HotelServiceImpl implements HotelService {

    @Autowired
    RestTemplate restTemplate;

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    private final String hotelsUrl ="http://localhost:8089/hotels";

    private final String hotelUrl ="http://localhost:8089/hotel/";


    @Override
    public List<Hotel> getAll() {

        ResponseEntity<List<Hotel>> response =
                restTemplate.exchange(hotelsUrl, HttpMethod.GET, null,
                        new ParameterizedTypeReference<List<Hotel>>() {});
        return response.getBody();
    }

    @Override
    public List<Hotel> filterList(SearchFilter filter) {
        String zip=filter.getZipcode();
        String min=String.valueOf(filter.getMin_price());
        String max=String.valueOf(filter.getMax_price());
        String filterUrl="http://localhost:8089/filteredHotel/"+zip+"/"+min+"/"+max+"";
        System.out.println("URI *****************************"+filterUrl);
        ResponseEntity<List<Hotel>> response =
                restTemplate.exchange( filterUrl, HttpMethod.GET, null,
                        new ParameterizedTypeReference<List<Hotel>>() {});
        return response.getBody();
    }

    @Override
    public Hotel getOne(long id) {
        String getOneHotel=hotelUrl+id;
        return restTemplate.getForObject(getOneHotel,Hotel.class,id);
    }
}
