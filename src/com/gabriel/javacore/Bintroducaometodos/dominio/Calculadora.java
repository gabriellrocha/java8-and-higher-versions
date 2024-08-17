package com.gabriel.javacore.Bintroducaometodos.dominio;

public class Calculadora {

    // método sem retorno
    public void somar() {
        System.out.println(10 + 10);
    }

    // método com parâmetros, mas sem retorno
    public void somar(int operando1, int operando2) {
        System.out.println(operando1 + operando2);
    }

    // método com parâmetros e com retorno
    public int somar(int operando1, int operando2, int operando3) {
        return operando1 + operando2 + operando3;
    }

    // método com retorno, mas sem parâmetro
    public int mutliplicar() {
        return 10 * 10;
    }

}
