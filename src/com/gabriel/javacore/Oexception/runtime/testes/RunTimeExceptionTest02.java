package com.gabriel.javacore.Oexception.runtime.testes;


// Lançando exception unchecked

public class RunTimeExceptionTest02 {
    public static void main(String[] args) {
        try {
            System.out.println(divisao(10, 0));

        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }

        System.out.println("Fluxo continua, pois a exception foi tratada");
        System.out.println(divisao(20, 4));
    }


    /**
     * @param number2 não pode ser 0
     * @throw IllegalArgumentException
     * */
    private static int divisao (int number1, int number2) {

        if (number2 == 0) {
            throw new IllegalArgumentException("Number 2 não pode ser igual a 0");
        }

        return number1 / number2;
    }
}
