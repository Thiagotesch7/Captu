package com.senai.captu.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.senai.captu.models.Categoria;

@Repository
public interface CategoriaRepository extends JpaRepository <Categoria, Integer> {


} 
