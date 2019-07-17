package mum.cs.edu.smartrentalapp.domain;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Mycar {
    private Long id;
    private String name;
    private String model;
    private String make;
    private LocalDate year;
    private double price_per_day;
    private Long registrationNumber;
    private LocalDate lastServiceDate;
    private String image_url;
    private Address address;

    private double service_charge;
    private double security_deposit;
    private String rent_policy;
    private String gear;
    private int seat;
    private LocalDate available_from;
    private String description;

}
