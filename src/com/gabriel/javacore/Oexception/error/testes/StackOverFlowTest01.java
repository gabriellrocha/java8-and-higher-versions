package com.gabriel.javacore.Oexception.error.testes;

public class StackOverFlowTest01 {

    // Throwable -> Error (Error não é uma exception)

    // Error - Não pode ser tratado pelo programa (tem que arrumar o código)

    public static void main(String[] args) {
        recursividade();

    }

    // Espaço de memória reservado para a stack(pilha) de execução é esgotado
    static void recursividade() {
        recursividade();
    }

    /*
        Stack - Serve para empilhar as chamadas de métodos à medida que são executados, e eles vão
        sendo removidas (desempilhadas) quando os métodos terminam a execução.

        - Isso garante que o programa saiba para onde retornar após a execução de cada método
        - Stack é limitada em tamanho
    * */

}
