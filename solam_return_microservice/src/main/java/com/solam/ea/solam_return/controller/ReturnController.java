package com.solam.ea.solam_return.controller;



import com.solam.ea.solam_return.dao.ReturnDAO;
import com.solam.ea.solam_return.domain.ReturnDomain;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
public class ReturnController {


    @Autowired
    private ReturnDAO returnService;


    //add new return
    @PostMapping(value = "/addRent", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ReturnDomain addReturn(@RequestBody ReturnDomain ret){
        return returnService.save(ret);
    }

    //list all the returns
    @GetMapping("/getAllReturns")
    public List<ReturnDomain> getAllReturns(){
        return returnService.findAll();
    }

    //find returns by rentId
    @GetMapping("/getReturnsByRentId/{id}")
    public List<ReturnDomain> getReturnsByRentId(@PathVariable long id){
        return returnService.findReturnByRentId(id);
    }

    //Find all returns by customerId
    @GetMapping("/getReturnsByCustomerId/{id}")
    public List<ReturnDomain> getReturnsByCustomerId(@PathVariable long id){
        return returnService.findReturnsByCustomerId(id);
    }

    //Find all returns by paymentId
    @GetMapping("/getReturnsByPaymentId/{id}")
    public List<ReturnDomain> getReturnsByPaymentId(@PathVariable long id){
        return returnService.findReturnsByPaymentId(id);
    }

    //Find all returns by checkedOut date
    @GetMapping("/getReturnsByCheckedOutDate/{checkOut}")
    public List<ReturnDomain> getReturnsByCheckedOutDate(@PathVariable String checkOut){

        List<ReturnDomain> result=new ArrayList<>();
        try {
            Date checkedOutDate=new SimpleDateFormat("yyyy-MM-dd").parse(checkOut);
            System.out.println(checkedOutDate);
            result= returnService.findReturnsByCheckOutEquals(checkedOutDate);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }




}
