package com.gabriel.javacore.Fassociacao.dominio;

public class Escola {

    private String nome;
    private Professor[] professores;

    public Escola(String nome, Professor... professores) {
        this.nome = nome;
        this.professores = professores;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Professor[] getProfessores() {
        return professores;
    }

}
