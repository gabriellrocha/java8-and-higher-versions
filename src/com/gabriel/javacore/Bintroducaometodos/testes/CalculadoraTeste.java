package com.gabriel.javacore.Bintroducaometodos.testes;

import com.gabriel.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTeste {
    public static void main(String[] args) {

        Calculadora calc = new Calculadora();

        calc.somar();
        calc.somar(6, 4);
        System.out.println(calc.mutliplicar());
        System.out.println(calc.somar(3, 6, 2));


    }
}
