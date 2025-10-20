package com.senai.captu.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senai.captu.models.Categoria;
import com.senai.captu.repositories.Categoriarepository;

@Service
public class Categoriaservice {

    @Autowired
    private Categoriarepository Cr;
    public Categoria salvar(Categoria categoria) {
        return Cr.save(categoria);
    }
}
