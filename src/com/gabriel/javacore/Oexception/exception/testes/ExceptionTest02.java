package com.gabriel.javacore.Oexception.exception.testes;

import java.io.File;
import java.io.IOException;

public class ExceptionTest02 {

    public static void main(String[] args) throws IOException{

        criarNovoArquivo();
        criarNovoArquivo2();
    }


    private static void criarNovoArquivo() throws IOException{
        File file = new File("arquivos\\teste.txt");

        try {
            file.createNewFile();

        } catch (IOException e) {
            e.printStackTrace(); // Caso 'hibrido' fazendo "tratamento" e relançando para quem chamar o método
            throw e;
        }
    }

    private static void criarNovoArquivo2() {
        File file = new File("arquivos\\boas-praticas.txt");
        try {
            file.createNewFile();

        } catch (IOException e) { // "Tratando a exceção"
            System.out.println(e.getMessage());
        }
    }
}
