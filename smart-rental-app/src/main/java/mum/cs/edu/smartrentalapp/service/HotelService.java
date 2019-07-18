package mum.cs.edu.smartrentalapp.service;





import mum.cs.edu.smartrentalapp.domain.Hotel;
import mum.cs.edu.smartrentalapp.domain.SearchFilter;

import java.util.List;

public interface HotelService  {


    List<Hotel> getAll();
    List<Hotel> filterList(SearchFilter filter);
    Hotel getOne(long id);

    Hotel update(Hotel hotel,long id);
}
