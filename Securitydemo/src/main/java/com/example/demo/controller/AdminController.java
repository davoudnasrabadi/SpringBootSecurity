/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.controller;
import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 *
 * @author davoudnasrabadi
 */

@RestController
@RequestMapping("/security/auth")
public class AdminController {
    
    @Autowired
    private BCryptPasswordEncoder passwordEncoder;
    @Autowired
    private UserRepository userRepository;
    
    @PostMapping("/add")
    public String addUser(@RequestBody User user){
        
        String password = user.getPassword();
        String enc_pass = passwordEncoder.encode(password);
        user.setPassword(enc_pass);
        userRepository.save(user);
        return "user added to database";
    }
}
