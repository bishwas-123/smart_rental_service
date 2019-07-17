package mum.edu.mycar.service;
import mum.edu.mycar.domain.Mycar;

import java.util.List;


public interface MyCarService {
    List<Mycar> getAll();
    void save(Mycar car);
    void delete(Long id);
    void update(Mycar car);
    Mycar get(Long id);
}
