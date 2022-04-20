/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author davoudnasrabadi
 */

@RestController
@RequestMapping("/rest/auth")
public class ApplicationController {
    
    @GetMapping("/process")
    public String process(){
        return "passed the spring security through DB";
    }
}
