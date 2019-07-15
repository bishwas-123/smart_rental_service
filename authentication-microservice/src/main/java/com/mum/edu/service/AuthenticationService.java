package com.mum.edu.service;

import com.mum.edu.domain.User;
import com.mum.edu.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthenticationService {

    @Autowired
    private UserRepository userRepository;

    public User authenticate(String uname, String pword){
        return userRepository.findByUsernameAndPassword(uname,pword);
    }

    @Autowired
    private UserRepository apartmentDao;


    public List<User> getAll() {
        return apartmentDao.findAll();
    }

    public void add(User book) {
        apartmentDao.save(book);
    }

    public User get(Long id) {
        return apartmentDao.findById(id).get();
    }

    public void update(User book) {
        apartmentDao.save(book);
    }

    public void delete(Long id) {
        apartmentDao.deleteById(id);
    }

}
