package mum.cs.edu.smartrentalapp.service;
import mum.cs.edu.smartrentalapp.domain.Mycar;
import mum.cs.edu.smartrentalapp.domain.SearchFilter;

import java.util.List;


public interface MyCarService {
    List<Mycar> getAll();

    List<Mycar> filterList(SearchFilter filter);
//    void save(Mycar car);
//    void delete(Long id);
//    void update(Mycar car);
//    Mycar get(Long id);
}
