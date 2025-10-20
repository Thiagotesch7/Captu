package com.senai.captu.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.senai.captu.models.Usuario;
import com.senai.captu.models.livro;
import com.senai.captu.services.Usuarioservice;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("Usuario")
public class Usuariocontroller {

    @Autowired
    private Usuarioservice Us;
    
    }



