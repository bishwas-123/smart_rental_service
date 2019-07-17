package mum.cs.edu.smartrentalapp.controller;
import mum.cs.edu.smartrentalapp.domain.Category;
import mum.cs.edu.smartrentalapp.domain.SearchFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import java.io.PrintWriter;
import java.util.List;

//@SessionAttributes("filter")
@Controller
public class HomePageController {



    @RequestMapping(value={"/", "/rental", "smart_rental","smartRental", "smart_rental_service", "home"},
            method= RequestMethod.GET)
    public String homepage(Model model)
    {
        model.addAttribute("searchFilter", new SearchFilter());
        Category c=new Category();
        List<Category> categoryList=c.getCategories();
        model.addAttribute("category",categoryList);
        return "views/home/index";
    }
    @PostMapping(value={"/checkAvailability1"})
    public ModelAndView routeToController(@ModelAttribute("searchFilter") SearchFilter searchFilter, HttpSession session){
        if(searchFilter.getCategory().equals("1")){
            session.setAttribute("filter",searchFilter);
          return new ModelAndView("redirect:/available/cars/");
        }
        else if(searchFilter.getCategory().equals("2")){
            return new ModelAndView("redirect:/available/apartment/");
        }else{
            return new ModelAndView("redirect:/available/hotels/");
        }
    }
}
