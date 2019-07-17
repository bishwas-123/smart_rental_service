package mum.cs.edu.smartrentalapp.apartment;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Address {
    private String country;
    private String state;
    private String city;
    private String street;
    private String zip;

}
