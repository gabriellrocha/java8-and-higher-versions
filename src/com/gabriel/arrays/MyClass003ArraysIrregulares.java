package com.gabriel.arrays;

public class MyClass003ArraysIrregulares {
    public static void main(String[] args) {

        // Array irregular -> Permite que cada array interno tenha um comprimento diferente

        /* Desta forma, o ARRAY BASE não aponta para nenhum array interno, todas as posições vão ser null.
         É necessário iniciá-los. -> SEGUNDO par de colchetes está vazio*/

        int [][] arrayIrregular = new int[3][];

        // Iniciando arrays interno
        arrayIrregular[0] = new int[2];
        arrayIrregular[1] = new int[5];
        arrayIrregular[2] = new int[3];

        // Foreach em array irregular

        for(int[] arrayBase : arrayIrregular) {     // Para cada array base do array irregular
            for(int numero : arrayBase) {           // Para cada número do array base
                System.out.println(numero);         // Faça
            }
        }
    }
}
