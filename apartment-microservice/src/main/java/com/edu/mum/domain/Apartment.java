package com.edu.mum.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "apartment")
public class Apartment {
    @Id
    @GeneratedValue
    private Long id;
    private String category;
    private String name;
    private double rentPerMonth;
    private String description;
    private Long vendorId;
//apartment adress
    private String country;
    private String state;
    private String city;
    private String street;
    private String zip;
    private String contact;
}
