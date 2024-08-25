package com.gabriel.javacore.Fassociacao.dominio;

import java.util.List;

public class Filho {

    private String nome;
    private Mae mae;

    public Filho(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Mae getMae() {
        return mae;
    }

    public void setMae(Mae mae) {
        this.mae = mae;
    }
}
