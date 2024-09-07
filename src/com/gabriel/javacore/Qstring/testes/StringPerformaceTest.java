package com.gabriel.javacore.Qstring.testes;

public class StringPerformaceTest {
    public static void main(String[] args) {

        long inicio = System.currentTimeMillis();
        concatString(30_000);
        long fim = System.currentTimeMillis();
        System.out.println("Tempo gasto String: " + (fim - inicio) + " ms");


        inicio = System.currentTimeMillis();
        concatStringBuilder(1_000_000);
        fim = System.currentTimeMillis();
        System.out.println("Tempo gasto StringBuilder: " + (fim - inicio) + " ms");


        inicio = System.currentTimeMillis();
        concatStringBuffer(1_000_000);
        fim = System.currentTimeMillis();
        System.out.println("Tempo gasto StringBuffer: " + (fim - inicio) + " ms");

    }

    private static void concatString(int vezes) {
        String teste = "";
        for (int i = 0; i < vezes; i++) {
            teste += i;             // 'cast' implícito
        }
    }

    private static void concatStringBuilder(int vezes) {
        // Preferível quando se precisa realizar muitas operações de modificação (concatenação/alteração) caracteres
        // É mutável, ou seja, operações de modificação acontecem no mesmo objeto o que é mais eficiente em termos de desempenho e memória

        StringBuilder stringBuilder = new StringBuilder(vezes); // não é sincronizado (não é thread-safe)

        for (int i = 0; i < vezes; i++) {
            stringBuilder.append(i);
        }
    }

    private static void concatStringBuffer(int vezes) {
        StringBuffer stringBuffer = new StringBuffer(vezes); // sincronizado (thread-safe)

        for (int i = 0; i < vezes; i++) {
            stringBuffer.append(i);
        }
    }

}
