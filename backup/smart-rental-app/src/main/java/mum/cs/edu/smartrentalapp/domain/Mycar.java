package mum.cs.edu.smartrentalapp.domain;
import java.time.LocalDate;

public class Mycar {

    private Long id;
    private String name;
    private String model;
    private String make;
    private LocalDate year;
    private Long registrationNumber;

    Mycar(){
        super();

    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setYear(LocalDate year) {
        this.year = year;
    }

    public void setRegistrationNumber(Long registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public void setLastServiceDate(LocalDate lastServiceDate) {
        this.lastServiceDate = lastServiceDate;
    }

    private LocalDate lastServiceDate;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }

    public String getMake() {
        return make;
    }

    public LocalDate getYear() {
        return year;
    }

    public Long getRegistrationNumber() {
        return registrationNumber;
    }

    public LocalDate getLastServiceDate() {
        return lastServiceDate;
    }

    public Mycar(String name, String model, String make, LocalDate year, Long registrationNumber, LocalDate lastServiceDate) {
        this.name = name;
        this.model = model;
        this.make = make;
        this.year = year;
        this.registrationNumber = registrationNumber;
        this.lastServiceDate = lastServiceDate;
    }
}
