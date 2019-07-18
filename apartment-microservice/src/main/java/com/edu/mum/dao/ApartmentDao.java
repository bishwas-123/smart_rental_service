package com.edu.mum.dao;

import com.edu.mum.domain.Apartment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApartmentDao extends JpaRepository<Apartment,Long> {
}
