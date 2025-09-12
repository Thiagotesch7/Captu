package com.senai.captu.models;

public class avaliacao {
    private int id;
    private String nota;

    public avaliacao() {
    }

    public avaliacao(int id, String nota) {
        this.id = id;
        this.nota = nota;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNota() {
        return nota;
    }

    public void setNota(String nota) {
        this.nota = nota;
    }

    
    
}

