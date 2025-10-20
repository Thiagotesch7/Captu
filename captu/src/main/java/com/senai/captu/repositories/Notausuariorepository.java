package com.senai.captu.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Notausuariorepository extends JpaRepository {

   Object Saveall = null; 
} 