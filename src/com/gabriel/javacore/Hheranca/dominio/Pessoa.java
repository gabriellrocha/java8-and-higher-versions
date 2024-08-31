package com.gabriel.javacore.Hheranca.dominio;

public class Pessoa {

    protected String nome;
    protected Integer idade;

    public Pessoa(String nome, Integer idade) {
        this.nome = nome;
        this.idade = idade;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public void imprimir() {
        System.out.println(nome);
        System.out.println(idade);
    }
}
