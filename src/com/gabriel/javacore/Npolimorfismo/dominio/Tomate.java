package com.gabriel.javacore.Npolimorfismo.dominio;

import java.time.LocalDate;

public class Tomate extends Produto {

    private LocalDate vencimento;

    public Tomate(String nome, Double preco) {
        super(nome, preco);
    }

    public Tomate(String nome, Double preco, Double taxa) {
        super(nome, preco, taxa);
    }

    public Tomate(String nome, Double preco, Double taxa, LocalDate vencimento){
        this(nome, preco, taxa);
        this.vencimento = vencimento;
    }

    public LocalDate getVencimento() {
        return vencimento;
    }

    public void setVencimento(LocalDate vencimento) {
        this.vencimento = vencimento;
    }
}
