package com.senai.captu.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.senai.captu.models.Categoria;
import com.senai.captu.models.Livro;

@Repository
public interface LivroRepository extends JpaRepository <Livro, Integer>{

    Object Saveall = null;
    
} 
