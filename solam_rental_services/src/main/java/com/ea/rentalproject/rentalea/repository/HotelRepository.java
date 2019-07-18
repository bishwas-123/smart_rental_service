package com.ea.rentalproject.rentalea.repository;

import com.ea.rentalproject.rentalea.domain.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface HotelRepository extends JpaRepository<Hotel, Long> {

    @Query("SELECT distinct mc From Hotel mc  Where mc.address.zip=?1 and mc.price>=?2 and mc.price<=?3 and mc.is_rented=0")
    List<Hotel> getAllFilteredHotel(String zip, double min, double max);
}
