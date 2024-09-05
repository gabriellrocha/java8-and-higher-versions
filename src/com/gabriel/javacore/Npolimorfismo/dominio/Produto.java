package com.gabriel.javacore.Npolimorfismo.dominio;

public abstract class Produto{

    protected String nome;
    protected Double preco;
    protected Double taxa;

    public Produto(String nome, Double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public Produto(String nome, Double preco, Double taxa) {
        this(nome, preco);
        this.taxa = taxa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Double getTaxa() {
        return taxa;
    }

    public void setTaxa(Double taxa) {
        this.taxa = taxa;
    }
}
