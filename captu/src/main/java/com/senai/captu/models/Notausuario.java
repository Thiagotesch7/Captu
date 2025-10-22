package com.senai.captu.models;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "notausuario")

public class Notausuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id")
    private int id;
    @Column (name = "usuario_id")
    private int usuarioId;
    @Column (name = "livro_id")
    private int livroId;
    @Column (name = "avaliacao_id")
    private int avaliacaoId;

    public Notausuario() {
    }

    public Notausuario(int id, int usuarioId, int livroId, int avaliacaoId) {
        this.id = id;
        this.usuarioId = usuarioId;
        this.livroId = livroId;
        this.avaliacaoId = avaliacaoId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(int usuarioId) {
        this.usuarioId = usuarioId;
    }

    public int getLivroId() {
        return livroId;
    }

    public void setLivroId(int livroId) {
        this.livroId = livroId;
    }

    public int getAvaliacaoId() {
        return avaliacaoId;
    }

    public void setAvaliacaoId(int avaliacaoId) {
        this.avaliacaoId = avaliacaoId;
    }

    
}
