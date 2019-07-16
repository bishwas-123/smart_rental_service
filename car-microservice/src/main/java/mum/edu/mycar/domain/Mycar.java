package mum.edu.mycar.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
    private String year;
    private Long registrationNumber;
    private String lastServiceDate;

    public Mycar(String name, String model, String make, String year, Long registrationNumber, String lastServiceDate) {
        this.name = name;
        this.model = model;
        this.make = make;
        this.year = year;
        this.registrationNumber = registrationNumber;
        this.lastServiceDate = lastServiceDate;
    }
}
