package mum.edu.mycar.service;
import mum.edu.mycar.domain.MyCar;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public interface MyCarService {
    List<MyCar> getAll();
    void save(MyCar car);
    void delete(Long id);
    void update(MyCar car);
    MyCar get(Long id);


}
