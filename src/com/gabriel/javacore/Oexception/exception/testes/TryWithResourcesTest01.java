package com.gabriel.javacore.Oexception.exception.testes;

import java.io.*;

public class TryWithResourcesTest01 {
    public static void main(String[] args) {

    }


    private static void readFile(){
        // Modo feio haha

        Reader reader = null;
        try {
            reader = new BufferedReader(new FileReader("teste.txt"));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) { // Evita NullPointerException
                    reader.close();
                    // Não há garantia que essa variável será inicializada, por isso o teste.
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private static void readFile2() {
        // Modo bonito haha

        try (Reader reader = new BufferedReader(new FileReader("teste.txt"))) { // (try-with-resources)

            /* Bloco try-with-resources permite gerenciar automaticamente a liberação de recursos,
                como arquivos, ou conexões, após seu uso, sem precisar fechá-los explicitamente no código.

               Melhora a legibilidade do código - introduzido no Java 7
               Usando com objetos com implementam AutoCloseable
             */

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
