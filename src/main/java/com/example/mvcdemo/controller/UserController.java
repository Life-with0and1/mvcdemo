package com.example.mvcdemo.controller;

import com.example.mvcdemo.model.User;
import com.example.mvcdemo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class UserController {

    @Autowired
    private UserRepository userRepository;

    // Show the HTML form
    @GetMapping("/form")
    public String showForm(Model model) {
        model.addAttribute("user", new User());
        return "form";
    }

    // Handle form submission
    @PostMapping("/submit")
    public String submitForm(@ModelAttribute User user, Model model) {
        userRepository.save(user);
        model.addAttribute("message", "User saved successfully!");
        return "success";
    }
}
