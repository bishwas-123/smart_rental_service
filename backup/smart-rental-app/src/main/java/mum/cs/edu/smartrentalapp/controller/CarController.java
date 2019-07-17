package mum.cs.edu.smartrentalapp.controller;

import mum.cs.edu.smartrentalapp.domain.Mycar;
import mum.cs.edu.smartrentalapp.service.MyCarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class CarController {
    @Autowired
    MyCarService carService;
    @GetMapping("/cars")
    public String cars(Model model){
        List<Mycar> cars = carService.getAll();
        model.addAttribute("cars",cars);
        return "views/cars/carList";
    }
//
//    public Long add(Person p) {
//        URI uri = restTemplate.postForLocation(pplUrl, p);
//        if (uri == null) { return null; }
//        Matcher m = Pattern.compile(".*/person/(\\d+)").matcher(uri.getPath());
//        m.matches();
//        return Long.parseLong(m.group(1));
//    }
//
//    public void update(Person p) {
//        restTemplate.put(personUrl, p, p.getId());
//    }
//
//    public void delete(Long id) {
//        restTemplate.delete(personUrl, id);
//    }



}
