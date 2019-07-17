package mum.cs.edu.smartrentalapp.controller;
import mum.cs.edu.smartrentalapp.domain.Mycar;
import mum.cs.edu.smartrentalapp.domain.SearchFilter;
import mum.cs.edu.smartrentalapp.service.MyCarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.context.request.WebRequest;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class CarController {
    @Autowired
    MyCarService carService;

    @GetMapping("/available/cars/")
    public String carsList(Model model, HttpSession session, WebRequest request){
        SearchFilter filter = (SearchFilter) session.getAttribute("filter");
        List<Mycar> cars = carService.filterList(filter);
        request.removeAttribute("filter", WebRequest.SCOPE_SESSION);
        model.addAttribute("cars",cars);
        return "views/cars/carList1";
    }
    @GetMapping("/searchItem")
    public String searchCategory(SearchFilter fIlter){
        return "views/cars/serachResult";
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
