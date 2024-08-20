package com.gabriel.javacore.Emodificadorstatic.domain;

public class Carro {

    // atributos static pertence à Classe e todos os objetos derivados compartilham o mesmo valor
    private static double velocidadeMaxima = 250;
    private String marca;

    public Carro(String marca) {
        this.marca = marca;
    }

    public static double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public static void setVelocidadeMaxima(double velocidadeMaxima) {
        Carro.velocidadeMaxima = velocidadeMaxima;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }


}
