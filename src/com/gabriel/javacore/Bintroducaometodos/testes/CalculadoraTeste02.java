package com.gabriel.javacore.Bintroducaometodos.testes;

import com.gabriel.javacore.Bintroducaometodos.dominio.Calculadora;
import com.gabriel.javacore.Bintroducaometodos.dominio.Calculadora02;

public class CalculadoraTeste02 {
    public static void main(String[] args) {

        Calculadora02 calc = new Calculadora02();

        // passando array para o método
        int [] numeros = {3, 6, 1, 3, 9, 7, 2};
        int resul = calc.somarArray(numeros);
        System.out.println(resul);

        // Usando varargs
        // Permite que um método aceite vários valores do mesmo tipo
        // Evita a necessidade de sobrecarregar métodos para diferentes números de argumentos
        int result2 = calc.somarVarargs(1, 6, 1, 8, 9, 32);
        System.out.println(result2);


        // Combinação com outros parâmetros
        calc.somarNumerosImprimiMensagem("Resultado", 34, 7, 12, 89);
    }
}
