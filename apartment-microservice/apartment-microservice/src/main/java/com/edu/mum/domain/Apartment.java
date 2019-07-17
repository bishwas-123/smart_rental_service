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
    private String name;
    @Embedded
    private Address address;
}
