package mum.edu.mycar.controller;

import mum.edu.mycar.domain.MyCar;
import mum.edu.mycar.service.MyCarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@RestController
@RequestMapping("/mycar")
public class MyCarController {
    @Autowired
    MyCarService carService;

    @GetMapping("/cars")
    public List<MyCar> getAll() {
        return carService.getAll();
    }

    @GetMapping("/cars/{id}")
    public MyCar get(@PathVariable int id) {
        MyCar mc =  carService.get(id);
       return mc;
    }

    @PostMapping("/cars")
    public RedirectView add(@RequestBody MyCar car) {
     carService.save(car);
      return new RedirectView("/cars/" + car.getId());
    }

    @PutMapping("/cars/{id}")
    public void update(@RequestBody MyCar car)
    {
       carService.update(car);
    }

    @DeleteMapping("/cars/{id}")
    public void delete(@PathVariable int id) {
        carService.delete(id);
    }

}
