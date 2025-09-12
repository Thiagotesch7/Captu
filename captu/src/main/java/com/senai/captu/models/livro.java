package com.senai.captu.models;


public class livro {
    private int id;
    private String nome;
    private String autor;
    private String sinopse;
    private int categoriaId;

    public livro() {
    }

    public livro(int id, String nome, String autor, String sinopse, int categoriaId) {
        this.id = id;
        this.nome = nome;
        this.autor = autor;
        this.sinopse = sinopse;
        this.categoriaId = categoriaId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public int getCategoriaId() {
        return categoriaId;
    }

    public void setCategoriaId(int categoriaId) {
        this.categoriaId = categoriaId;
    }

    
}
