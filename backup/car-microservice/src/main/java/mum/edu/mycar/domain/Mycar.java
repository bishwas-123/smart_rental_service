package mum.edu.mycar.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Setter
@Getter
@NoArgsConstructor
@Entity
public class Mycar {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String model;
    private String make;
    private LocalDate year;
    @Column(name="registration_number")
    private Long registrationNumber;
    @Column(name="last_service_date")
    private LocalDate lastServiceDate;

    public Mycar(String name, String model, String make, LocalDate year, Long registrationNumber, LocalDate lastServiceDate) {
        this.name = name;
        this.model = model;
        this.make = make;
        this.year = year;
        this.registrationNumber = registrationNumber;
        this.lastServiceDate = lastServiceDate;
    }
}
