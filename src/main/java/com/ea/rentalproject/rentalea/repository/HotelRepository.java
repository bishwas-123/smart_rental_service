package com.ea.rentalproject.rentalea.repository;

import com.ea.rentalproject.rentalea.domain.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface HotelRepository extends JpaRepository<Hotel, Long> {
}
