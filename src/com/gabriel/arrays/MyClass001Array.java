package com.gabriel.arrays;

public class MyClass001Array {
    public static void main(String[] args) {

        // Variável composta que agrupa múltiplos elementos de um mesmo tipo
        // Caso não inserir valor nas posições por padrão o Java faz isso, sendo eles:
            // byte, int, short, long = 0
            // float, double = 0,0
            // boolean = false
            // char = `\u0000` representa espaço em branco
            // Objetos = null

        // Declaração e instanciação
        int [] idades = new int[3];

        // Inserindo valores
        idades[0] = 14;
        idades[1] = 17;
        idades[2] = 29;

       // Acessando valores
        for (int i=0; i< idades.length; i++) {
            System.out.println(idades[i]);
        }


    }
}
