package com.gabriel.introducao;

import java.util.Scanner;

public class MyClass004OperadoresLogicos {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // usados para combinar expressões boolean ou inverter o valor lógico de uma expressão
        // muito usados em conjunto com os operadores relacionais

        // Mais usados
        // avaliam apenas o necessário - avaliam o segundo operando apenas se necessário
        // && (and) - retorna true apenas se ambos operandos forem true
        // || (ou) - retorna true se pelo menos um operando for true.

        // ! Inverte o valor booleano do operando

        // sempre avaliam AMBOS operando
        // ^ (ou exclusivo) - retorna true SE APENAS um dos operandos for true
        // & (and curto-circuito) - retorna true SOMENTE SE AMBOS operandos forem true
        // | (ou lógico curto-circuito) - retorna true SE PELO MENOS UM dos operandos for true

        double totalContaCorrente = 7900;
        double cartaCredito = 35000;

        System.out.println("Qual o valor do carro que gostaria de comprar? ");
        double valorCarro = scanner.nextDouble();

        // apenas uma condição precisa ser verdade(true)
        boolean consigoComprar = totalContaCorrente >= valorCarro || cartaCredito>= valorCarro;
        System.out.println(consigoComprar);
    }
}
