package com.gabriel.introducao;

import java.util.Scanner;

public class MyClass007EstruturaControleSwitchExercicio {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // utilizando switch e dados os valores de 1 a 7, imprima se é dia útil ou final de semana
        // considerando o dia 1 como domingo

        System.out.println("Informe um número de 1 a 7: ");
        byte dia = scanner.nextByte();


        switch (dia) {
            case 1:
            case 7:
                System.out.println("Final de semana!");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia útil");
                break;
            default:
                System.out.println("Opção inválida!");
        }
    }
}
