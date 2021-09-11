package com.example.getmesocialservice.repository;

import com.example.getmesocialservice.model.User;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {



    public User getUser(){

        User user = new User("Haris", "India", 32, "https://images.app.goo.gl/gPtNfRMshHdmA1jd6");
        return user;
    }
}
