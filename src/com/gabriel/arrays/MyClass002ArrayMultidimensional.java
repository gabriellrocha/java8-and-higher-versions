package com.gabriel.arrays;

public class MyClass002ArrayMultidimensional {
    public static void main(String[] args) {

        // É um array 'linkado' com outros arrays
        // É apenas um array que contém outros arrays como seus elementos, o mais comum é o Bidimensional


        String[][] arrayBidimensional = new String[3][3];

        // Inserindo valores
        for(int i = 0; i < arrayBidimensional.length; i++) {
            for (int j = 0; j < arrayBidimensional[i].length; j++) {
                arrayBidimensional[i][j] = "Gabriel " + i;
            }
        }

        // Acessando valores
        for(int i = 0; i < arrayBidimensional.length; i++) {
            for (int j = 0; j < arrayBidimensional[i].length; j++) {
                System.out.print(arrayBidimensional[i][j] + " ");
            }
            System.out.println();
        }

        // Foreach em array bidimensional
        for(String[] arrayBase : arrayBidimensional) {       // Para cada array INTERNO do array BASE
            for(String nome : arrayBase) {                   // Para cada String dentro do array INTERNO
                System.out.println(nome);                    // Faça
            }
        }
    }
}
