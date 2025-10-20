package com.senai.captu.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.senai.captu.models.Categoria;
import com.senai.captu.services.Categoriaservice;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("Categoria")
public class Categoriacontroller {

    @Autowired
    private Categoriaservice Cs;

    @PostMapping("/salvar")
    public Categoria salvar(@RequestBody Categoria categoria) {
        return Cs.salvar(categoria);
    }

    
}
