package mum.cs.edu.smartrentalapp.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HotelController {

    @GetMapping("/available/hotels/")
    public String carsList(Model model){
//        List<Mycar> cars = carService.getAll();
//        model.addAttribute("cars",cars);
        return "views/cars/carList";
    }
}
