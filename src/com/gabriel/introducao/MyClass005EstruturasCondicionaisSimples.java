package com.gabriel.introducao;

import java.util.Scanner;

public class MyClass005EstruturasCondicionaisSimples {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // Define o fluxo da aplicação de acordo uma condição
        // Condição avaliada deve ser um valor boolean

        System.out.println("Informe a idade para o papai saber se pode sair? ");
        int idade = scan.nextInt();
        boolean podeSairApos22 = idade >=18;

        // Condicional simples
        if (podeSairApos22) {
            System.out.println("Permitido sair após às 22:00");
        }

        if(!podeSairApos22) { // inverte valor lógico
            System.out.println("Vai ficar em casa");
        }

        System.out.println("Qual o valor que você tem? ");
        double valorDisponivel = scan.nextDouble();

        // Condicional composta
        if (valorDisponivel >= 5000) {
            System.out.println("Vamos comprar o Playstation 5");
        } else {
            System.out.println("Vamos comprar um Xbox 360 :(");
        }
    }
}
