package com.gabriel.introducao;

import java.util.Scanner;

public class MyClass007EstruturaControleSwitch {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe sua idade:");
        int idade = scanner.nextInt();

        // tipos aceito -> byte, short, int, char, enum, String
        // Estrutura de controle de fluxo que permite executar diferentes blocos de código com base no valor de uma expressão
        // Se um case não termina com um break, o fluxo de execução continuará para o próximo case até encontrar um break ou o fim do 'switch'

        // permite escolher entre vários caminhos de execução (controle com break)
        switch (idade) {
            case 8:
                System.out.println("Criança!");
                break;
            case 13:
                System.out.println("Adolescente!!");
                break;
            case 18:
                System.out.println("Adulto!!!");
                break;
            default:
                System.out.println("Erro :/");
        }
    }
}
