package com.ea.rentalproject.rentalea.domain;

import lombok.Data;


import javax.persistence.*;

@Data
@Entity
public class Hotel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;
    private String contact;
    private String email;
    private String website;

    /*@Embedded
    private Address address;*/

    public Hotel(String name, String contact, String email, String website) {
        this.name = name;
        this.contact = contact;
        this.email = email;
        this.website = website;
    }

}
