package com.senai.captu.models;


public class notausuario {
    private int id;
    private int usuarioId;
    private int livroId;
    private int avaliacaoId;

    public notausuario() {
    }

    public notausuario(int id, int usuarioId, int livroId, int avaliacaoId) {
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
