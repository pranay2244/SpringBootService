package com.skool.Skool.controllers;

import com.skool.Skool.models.UserModel;
import com.skool.Skool.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Calendar;
import java.util.Date;

@RestController
@RequestMapping("auth")
public class UserController {
    @Autowired
    UserRepository userRepository;
    @GetMapping("/login")
    String mapping(){
        @Deprecated
        UserModel model = new UserModel("pk2244", "Pranay", "Kumar", "M", new Date(2000, Calendar.AUGUST, 24), "peek@gmail.com", "9381244438",
                "Peek Limited", "My Home Bhooja", 1, true, "", new Date(), new Date(), true );
        userRepository.save(model);
        return "Peek";
    }

    @GetMapping("/signup")
    boolean createUser(@RequestBody UserModel model){
        return true;
    }
}
