package com.senai.captu.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.senai.captu.models.Categoria;
import com.senai.captu.models.Notausuario;

@Repository
public interface Notausuariorepository extends JpaRepository <Notausuario, Integer>{

   Object Saveall = null; 
} 