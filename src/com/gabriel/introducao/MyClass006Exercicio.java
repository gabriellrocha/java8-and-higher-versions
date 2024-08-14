package com.gabriel.introducao;

import java.util.Scanner;

public class MyClass006Exercicio {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

       // Calculo imposto mensal de acordo com a faixa salarial

        // até 2112,00 isento
        // entre 2112,01 | 2826,65 ---- 7,5%
        // entre 2826,66 | 3751,05 ---- 15%
        // entre 3751,06 | 4664,68 ---- 22,5%
        // acima 4665,68  ------------- 27,5%

        System.out.println("Informe o salário (sem virgulas ou pontos): ");
        double percentual;
        double salarioMensal = scanner.nextDouble();

        if(salarioMensal < 2112) {
            percentual = 0;
        } else if (salarioMensal < 282665) {
            percentual = 7.5 / 100;
        } else if (salarioMensal < 375105) {
            percentual = 15.0 / 100;
        } else if (salarioMensal < 466468) {
            percentual = 22.5 / 100;
        } else {
            percentual = 27.5 / 100;
        }

        double desconto = salarioMensal * percentual;
        System.out.printf("IRPF R$ %.2f \nSalário após deduções R$ %.2f", desconto, (salarioMensal - desconto));
    }
}
