package com.gabriel.introducao;

import java.util.Scanner;

public class MyClass010EstruturaRepeticaoExercicio {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Dado o valor de um carro, informe EM ATÉ quantas vezes pode ser parcelado. (usando laços de repetição)
        // Condição: valorParcela >= 1000

        double valorCarro = 57900;
        for (int parcela = 1; parcela <= valorCarro; parcela ++) {
            double valorParcela = valorCarro / parcela;
            if(valorParcela >= 1000) {
                System.out.printf(parcela + "° R$%.2f\n",valorParcela);
            } else {
                break;
            }
        }
    }
}
