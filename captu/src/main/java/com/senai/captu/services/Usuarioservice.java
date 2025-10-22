package com.senai.captu.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senai.captu.models.Usuario;
import com.senai.captu.repositories.UsuarioRepository;

@Service
public class Usuarioservice {

    @Autowired
    private UsuarioRepository usuarioRepository;

private List<Usuario> usuarios = new ArrayList<>();

    public boolean cadastrar(Usuario novoUsuario) {
        for (Usuario u : usuarios) {
           if ("email@example.com".equals(u.getEmail())) {
                return false; 
            }
        }
        usuarios.add(novoUsuario);
        return true;
    }

    public boolean login(String email, String senha) {
        for (Usuario u : usuarios) {
            if (email.equals(u.getEmail()) && senha.equals(u.getSenha())) {
                return true;
            }
        }
        return false;
    }
}
