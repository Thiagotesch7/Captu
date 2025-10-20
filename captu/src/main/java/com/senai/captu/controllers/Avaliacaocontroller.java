package com.senai.captu.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.senai.captu.services.Avaliacaoservice;

@RestController
@RequestMapping("Avaliacao")
public class Avaliacaocontroller {

    @Autowired
    private Avaliacaoservice As;
    
}
