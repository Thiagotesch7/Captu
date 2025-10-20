package com.senai.captu.services;

import org.springframework.stereotype.Service;

import com.senai.captu.models.Usuario;
import com.senai.captu.repositories.Usuariorepository;

import jakarta.validation.constraints.Email;

@Service
public class Usuarioservice {
    private Usuariorepository usuariorepository;
    public String login(String email, String senha) {
        Usuario usuario = usuariorepository.findBy(email);
        return "Usuario logado com sucesso";
    }
    return "Falha ao logar o Usuario";


}
