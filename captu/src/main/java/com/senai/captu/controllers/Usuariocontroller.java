package com.senai.captu.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.senai.captu.models.Usuario;
import com.senai.captu.services.Usuarioservice;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("Usuario")
public class Usuariocontroller {

    @Autowired
    private Usuarioservice Us;
    @PostMapping("/cadastro")
    public String cadastrar(@RequestBody Usuario usuario) {
        boolean sucesso = Us.cadastrar(usuario);
        if (sucesso) {
            return "Usuário cadastrado com sucesso!";
        } else {
            return "Erro: E-mail já cadastrado.";
        }
    }

    // Endpoint para login
    @PostMapping("/login")
    public String login(@RequestBody Usuario usuario) {
        boolean autenticado = Us.login(usuario.getEmail(), usuario.getSenha());
        if (autenticado) {
            return "Login realizado com sucesso!";
        } else {
            return "E-mail ou senha inválidos.";
        }
    }
}



