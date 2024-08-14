package com.gabriel.introducao;

import java.util.Scanner;

public class MyClass008EstruturasRepeticaoWhile {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        char opcao = 'n';
        // Utilizadas para executar um bloco de código múltiplas vezes com base em condições específicas
        // Evitam repetição manual do código realizando tarefas de maneira mais eficiente

        // While - executa bloco de código enquanto a condição especificada for verdadeira
        // Ideal para situações em que o número de iterações não for conhecido previamente


        // (condição resulta em 'boolean')
        while (!(opcao == 's')) {
            System.out.println("Java é a melhor linguagem de programação! Ficou claro? (s/n)");
            opcao = scanner.next().charAt(0);
        }

//       loop 'do-while' garante a execução do código pelo menos uma vez, pois, a condição é verificada após a execução do bloco

//        do {
//            Bloco de código
//        } while (true);

    }
}
