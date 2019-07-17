package mum.cs.edu.smartrentalapp.controller;

import mum.cs.edu.smartrentalapp.apartment.Apartment;
import mum.cs.edu.smartrentalapp.domain.user.User;
import mum.cs.edu.smartrentalapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class LoginController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/login")
    public String login(Model model){
        model.addAttribute("user",new User());
        return "views/home/login";
    }

    @RequestMapping(value = "/register")
    public String register(Model model){
        model.addAttribute("user",new User());
        return "views/home/register";
    }

    @PostMapping(value = "/checkLogin")
    public ModelAndView checkLogin(@ModelAttribute User user, HttpSession session){
        System.out.println("user :"+user);
        User u = userService.authenticate(user);

        ModelAndView mav = new ModelAndView();

        if (u != null){
            session.setAttribute("current-user",u);
            mav.addObject("currentUser",u);
            mav.setViewName("views/home/index");
        }else {
            mav.addObject("message","login failed");
            mav.setViewName("views/home/login");
        }
        return mav;

    }@PostMapping(value = "/checkRegister")
    public ModelAndView checkRegister(@ModelAttribute("user") User user){
//        User u = userService.authenticate(user);
        ModelAndView mav = new ModelAndView();
        if (user != null ){
            userService.add(user);
            mav.setViewName("views/home/index");

        }else {
            mav.addObject("message","registration failed");
            mav.setViewName("views/home/register");
        }
        return mav;

    }

    @RequestMapping(value = "/apartments")
    public String getApartments(Model model){
        List<Apartment> apartmentList= userService.getApartments();
        model.addAttribute("apartments",apartmentList);
        return "index";

    }
}
