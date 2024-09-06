package com.gabriel.javacore.Oexception.dominio.exception.testes;

import java.io.File;
import java.io.IOException;

public class ExceptionTest01 {

    // Throwable -> Exception

    // Todas que herdam diretamente de Exception são exceções verificadas (checked)
    // Indicam erros que podem ser previstos e DEVEM ser tratados (do contrário código não compila)

    // Compilador força a resolver. Exemplos:

    // ClassNotFoundException - classe necessária em tempo de execução não encontrada
    // IOException - Falhas em leitura/escrita de arquivos
    // FileNotFoundException - Arquivo nã encontrado

    public static void main(String[] args) {

        criarNovoArquivo();
    }


    private static void criarNovoArquivo() {
        File file = new File("arquivos\\teste.txt");

        try { // Tenta fazer...
            boolean isCreated = file.createNewFile();
            System.out.println(isCreated);

            // É gerado um objeto que descreve o erro. Sua referência é atribuída na variável 'e'
        } catch (IOException e) { // Caso ocorra algo - Captura
            e.printStackTrace();
        }

        // Boas práticas:
        // Sempre tratar as exceções de forma específica, fazendo assim um tratamento melhor
        // NUNCA deixar o bloco catch vázio
        // NUNCA colocar regras de negócio no catch
    }
}
