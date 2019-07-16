package mum.edu.mycar.service;

import mum.edu.mycar.domain.Mycar;
import mum.edu.mycar.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
@Service
@Transactional
public class MyCarServiceImpl implements  MyCarService {
    @Autowired
    CarRepository carRepository;
    @Override
    public List<Mycar> getAll() {
        return carRepository.findAll();
    }

    @Override
    public void save(Mycar car) {
       carRepository.save(car);
    }

    @Override
    public void delete(Long id) {

        carRepository.deleteById(id);
    }

    @Override
    public void update(Mycar car) {
      carRepository.save(car);
    }

    @Override
    public Mycar get(Long id) {

        return  carRepository.findById(id).get();
    }
}
