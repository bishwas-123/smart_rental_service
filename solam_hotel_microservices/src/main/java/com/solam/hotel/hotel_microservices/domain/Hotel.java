package com.solam.hotel.hotel_microservices.domain;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
public class Hotel {


    private String name;

    private String contact;
    private String email;
    private String website;
    private String imageUrl;
    private String description;
    private long vendorId;
    private String state;
    private String city;
    private String street;
    private String zipCode;
    private double price;
    private int is_rented;

    public Hotel(String name, String contact, String email, String website, String imageUrl, long vendorId, String state, String city, String street, String zipCode) {
        this.name = name;
        this.contact = contact;
        this.email = email;
        this.website = website;
        this.imageUrl = imageUrl;
        this.vendorId = vendorId;
        this.state = state;
        this.city = city;
        this.street = street;
        this.zipCode = zipCode;
    }
}
