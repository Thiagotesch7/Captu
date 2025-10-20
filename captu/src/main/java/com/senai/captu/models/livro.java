package com.senai.captu.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "livro")

public class Livro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id")
    
    private int id;
    @Column (name = "nome")
    private String nome;
    @Column (name = "autor")
    private String autor;
    @Column (name = "sinopse")
    private String sinopse;
    @Column (name = "categoria_id")
    private int categoriaId;

    public Livro() {
    }

    public Livro(int id, String nome, String autor, String sinopse, int categoriaId) {
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
