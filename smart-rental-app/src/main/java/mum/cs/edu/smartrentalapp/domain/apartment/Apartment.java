package mum.cs.edu.smartrentalapp.domain.apartment;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Apartment {
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