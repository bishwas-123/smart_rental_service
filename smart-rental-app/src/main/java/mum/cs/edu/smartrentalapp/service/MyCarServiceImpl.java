package mum.cs.edu.smartrentalapp.service;
import mum.cs.edu.smartrentalapp.domain.Mycar;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class MyCarServiceImpl implements  MyCarService {
    @Autowired
    RestTemplate restTemplate;

    private final String carURL="http://localhost:8081/mycar/cars";
    private final String cURL="localhost:8081/mycar/cars/{id}";
    @Override
    public List<Mycar> getAll() {
        ResponseEntity<List<Mycar>> response =
                restTemplate.exchange(carURL, HttpMethod.GET, null,
                        new ParameterizedTypeReference<List<Mycar>>() {});
        return response.getBody();
    }



//    public Mycar get(Long id) {
//        return restTemplate.getForObject(carUrl, Mycar.class, id);
//    }
//
//    @Override
//    public void save(Mycar car) {
//       carRepository.save(car);
//    }
//
//    @Override
//    public void delete(Long id) {
//
//        carRepository.deleteById(id);
//    }
//
//    @Override
//    public void update(Mycar car) {
//      carRepository.save(car);
//    }
//
//    @Override
//    public Mycar get(Long id) {
//
//        return  carRepository.findById(id).get();
//    }
}
