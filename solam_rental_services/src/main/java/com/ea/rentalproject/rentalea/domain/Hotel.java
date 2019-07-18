package com.ea.rentalproject.rentalea.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})

public class Hotel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotNull
    private String name;
    @NotNull
    private String contact;
    @NotNull
    private String email;
    @NotNull
    private String website;
    @NotNull
    private String image_url;

    @NotNull
    private String description;

    @NotNull
    private double price;

    @NotNull
    private long vendor_id;

    @NotNull
    private int is_rented;

    @Embedded
    private Address address;
    /*//apartment address
    @NotNull
    private String state;
    @NotNull
    private String city;
    @NotNull
    private String street;
    @NotNull
    private String zip_code;*/


}
