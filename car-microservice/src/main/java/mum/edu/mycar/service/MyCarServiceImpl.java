package mum.edu.mycar.service;

import mum.edu.mycar.domain.MyCar;
import mum.edu.mycar.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class MyCarServiceImpl implements  MyCarService {
    @Autowired
    CarRepository carRepository;
    @Override
    public List<MyCar> getAll() {
        return carRepository.findAll();
    }

    @Override
    public void save(MyCar car) {
       carRepository.save(car);
    }

    @Override
    public void delete(Long id) {

        carRepository.deleteById(id);
    }

    @Override
    public void update(MyCar car) {
      carRepository.save(car);
    }

    @Override
    public MyCar get(Long id) {

        return  carRepository.findById(id).get();
    }
}
