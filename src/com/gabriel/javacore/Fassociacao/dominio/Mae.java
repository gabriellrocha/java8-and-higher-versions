package com.gabriel.javacore.Fassociacao.dominio;

import java.util.ArrayList;
import java.util.List;

public class Mae {

    private String nome;
    private final List<Filho> filhos = new ArrayList<>();

    public Mae(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Filho> getFilhos() {
        return filhos;
    }

    public void setFilho(Filho filho) {
        filhos.add(filho);
        filho.setMae(this);
    }
}
