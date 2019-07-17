package mum.cs.edu.smartrentalapp.apartment;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Apartment {
    private Long id;
    private String name;
    private Address address;
}
