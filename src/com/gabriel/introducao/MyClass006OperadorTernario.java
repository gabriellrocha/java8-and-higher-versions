package com.gabriel.introducao;

import java.util.Scanner;

public class MyClass006OperadorTernario {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual seu património líquido? ");
        double patrimonio = scanner.nextDouble();

        // Expressão concisa que avalia uma condição e retorna um valor baseado se essa condição é true or false
        // Substitui o 'if-else' para atribuir um valor a uma variável de forma mais concisa

        // Sintaxe: condição ? valorSeVerdadeiro : valorSeFalso

        // Comprar apartamento se património líquido > 150000
        String mensagemComprar = "Vou realizar a compra do apartamento";
        String mensagemNaoComprar = "Não vou realizar a compra do apartamento, no momento!";
        String resultado;

        resultado = patrimonio >= 150000 ?  mensagemComprar : mensagemNaoComprar;
        System.out.println(resultado);
    }
}
