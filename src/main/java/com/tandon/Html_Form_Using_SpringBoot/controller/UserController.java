package com.tandon.Html_Form_Using_SpringBoot.controller;

import com.tandon.Html_Form_Using_SpringBoot.model.User;
import com.tandon.Html_Form_Using_SpringBoot.repository.IUserRepository;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller

public class UserController {
    @Autowired
    private IUserRepository repository;


    @GetMapping("/api")
    public String index() {
        return "index";
    }

    @PostMapping("/register")
    public String registration(@ModelAttribute User user, HttpSession Session) {
        System.out.println(user);
        repository.save(user);
        Session.setAttribute("message", "User Registration Successful");
        return "success";
    }

}
