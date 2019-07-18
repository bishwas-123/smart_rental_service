package mum.cs.edu.smartrentalapp.service;

import mum.cs.edu.smartrentalapp.domain.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class UserService {

    @Autowired
    private RestTemplate restTemplate;

    private final String apartmentUrl = "http://localhost:8081/api/apartment/{id}";
    private final String apartmentListUrl = "http://localhost:8081/api/apartments";
    private final String authUrl = "http://localhost:8080/auth/authenticate";
    private final String userAddUrl = "http://localhost:8080/auth/addUser";

//    public List<Apartment> getApartments(){
//        ResponseEntity<List<Apartment>> response = restTemplate.exchange(apartmentListUrl, HttpMethod.GET, null,
//                new ParameterizedTypeReference<List<Apartment>>() {
//                });
//        return response.getBody();
//    }

    public User authenticate(User user){
        User autheticatedUser = restTemplate.postForObject(authUrl,user,User.class);
        System.out.println("returned user ="+ autheticatedUser);
        return autheticatedUser;
    }
    public void add(User u){
        restTemplate.postForObject(userAddUrl,u,User.class);

    }

    public void registerUser(User user){
        restTemplate.postForObject(authUrl,user,User.class);
    }
}
