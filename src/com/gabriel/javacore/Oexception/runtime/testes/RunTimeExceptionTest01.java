package com.gabriel.javacore.Oexception.runtime.testes;

public class RunTimeExceptionTest01 {


    // Throwable -> Exception -> RuntimeException

    // Todas que herdam de RunTimeException são exceções não verificadas (unchecked exceptions)
    // Indicam erros lógicos no programa (culpa do programador haha)
    // Não é obrigatório tratá-las (o programa compila), mas pode da ruim. Exemplos:


    public static void main(String[] args) {

        int[] numbers = {4, 9};
        System.out.println(numbers[2]);
        

    }
}
