package com.gabriel.arrays;

public class MyClass001ArrayForeach {
    public static void main(String[] args) {

        // Outra maneira de instanciar um array, mas agora passando valores

        String[] nomes = {"Gabriel", "Maria", "Moises"};

        // Foreach foca em uma programação declarativa
        // Declarativa -> Ênfase em O QUE FAZER ao invés de COMO FAZER que é o caso da programação imperativa

        // nome é uma variável LOCAL
        // variáveis locais só existem em um determinado ESCOPO
        for(String nome : nomes) {
            System.out.println(nome);
        }
    }
}
