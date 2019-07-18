package com.edu.mum.controller;

import com.edu.mum.domain.Apartment;
import com.edu.mum.service.ApartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ApartmentController {
    @Autowired
    private ApartmentService apartmentService;

    @GetMapping("/apartments")
    public List<Apartment> getAll() {
        return apartmentService.getAll();
    }

    @GetMapping("/apartments/{id}")
    public Apartment get(@PathVariable Long id) {
        Apartment apt=  apartmentService.get(id);
        return apt;
    }

    @PostMapping("/apartments")
    public RedirectView add(@RequestBody Apartment apartment) {
        apartmentService.add(apartment);
        return new RedirectView("/apartments/" + apartment.getId());
    }

    @PutMapping("/apartments/{id}")
    public void update(@RequestBody Apartment apartment) {
        apartmentService.update(apartment);
    }

    @DeleteMapping("/apartments/{id}")
    public void delete(@PathVariable Long id) {
        apartmentService.delete(id);
    }
}
