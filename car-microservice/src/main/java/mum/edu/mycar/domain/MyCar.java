package mum.edu.mycar.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate;

@Setter
@Getter
@NoArgsConstructor
@Entity
public class MyCar {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String model;
    private String make;
    private LocalDate year;
    private Long registrationNumber;
    private LocalDate lastServiceDate;

    public MyCar(String name, String model, String make, LocalDate year, Long registrationNumber, LocalDate lastServiceDate) {
        this.name = name;
        this.model = model;
        this.make = make;
        this.year = year;
        this.registrationNumber = registrationNumber;
        this.lastServiceDate = lastServiceDate;
    }
}
