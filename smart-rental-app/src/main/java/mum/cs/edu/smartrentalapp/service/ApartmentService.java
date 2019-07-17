package mum.cs.edu.smartrentalapp.service;

import mum.cs.edu.smartrentalapp.apartment.Apartment;
import mum.cs.edu.smartrentalapp.domain.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Component
public class ApartmentService {
    @Autowired
    private RestTemplate restTemplate;

    private final String apartmentUrl = "http://localhost:8082/api/apartment/{id}";
    private final String apartmentListUrl = "http://localhost:8082/api/apartments";

    public List<Apartment> getApartments(){
        ResponseEntity<List<Apartment>> response = restTemplate.exchange(apartmentListUrl, HttpMethod.GET, null,
                new ParameterizedTypeReference<List<Apartment>>() {
                });
        return response.getBody();
    }

}
