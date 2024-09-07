package com.gabriel.javacore.Qstring.testes;

public class StringTest01 {

    public static void main(String[] args) {

        // String no Java é imutável

        // Objetos imutáveis são aqueles cujo estado interno não pode ser alterado
        // Operações com objetos imutáveis retornam um novo Objeto

        // String literal
        String nome = "Gabriel"; // -> Verifica se já existe uma String com o mesmo valor Pool, true - retorna a referência | false - cria e adiciona ao Pool
        String nome2 = "Gabriel";

        System.out.println(nome == nome2); // true, pois ambas variáveis tem a mesma referência'

        // Pool String - área especial no Heap onde instâncias de String são armazenadas para otimizar o uso de memória
        // Objetivo - Evitar a criação de múltiplas instâncias de string com o mesmo valor, promovendo o reuso já que string são imutáveis

        // Criada fora do Pool
        String nome3 = new String("Gabriel");

        System.out.println(nome3 == nome2); // false

        nome3 = nome3.intern(); // usando intern() para colocar nome3 no Pool
        System.out.println(nome3 == nome2); // true

    }
}
