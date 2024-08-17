package com.gabriel.javacore.Bintroducaometodos.testes;

import com.gabriel.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTeste {
    public static void main(String[] args) {

        Calculadora calc = new Calculadora();

        calc.somar();
        calc.somar(6, 4);
        System.out.println(calc.mutliplicar());
        System.out.println(calc.somar(3, 6, 2));

        //-----------------------------------------------------------------------------
        // Como funciona a passagem de valores primitivos para métodos

        int operando1 = 25;
        int operando2 = 75;

        //O que é passado para o método é apenas uma cópia do valor
        // (corpo do método) contínua a explicação....
        calc.passagemPorValor(operando1, operando2);

        System.out.println(operando1);
        System.out.println(operando2);


    }
}
