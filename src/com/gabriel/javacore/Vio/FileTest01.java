package com.gabriel.javacore.Vio;

import java.io.File;
import java.io.IOException;
import java.time.Instant;
import java.time.ZoneId;

public class FileTest01 {
    public static void main(String[] args) {

        // File - Representa um ARQUIVO ou DIRETÓRIO no sistema de arquivos
        // File - NÃO MANIPULA DIRETAMENTE O CONTEÚDO DO ARQUIVO, oferece 'apenas' métodos para operações

        // Algumas funcionalidades
        // Manipulação de arquivos e diretórios: criação - renomeação - exclusão e verificação de existência
        // Consulta atributos - permissões (leitura, escrita, execução), tamanho, datas modificação, se é diretório ou arquivo
        // Listagem: lista arquivos e subdiretórios de um diretório

        boolean isCreated = false;

        File file = new File("arquivos\\file.txt");

        try {
            isCreated = file.createNewFile();
            System.out.println("Path: " + file.getPath());
            System.out.println("Path absolut: " + file.getAbsolutePath());
            System.out.println("Diretório: "+ file.isDirectory());
            System.out.println("File: " + file.isFile());
            System.out.println("Tamanho em Bytes: " + file.length());
            System.out.println("Última modificação: " + Instant.ofEpochMilli(file.lastModified()).atZone(ZoneId.systemDefault())); // return long em milissegundos desde 1970 - transforma em Data
            System.out.println();
            if (file.exists()) {
                System.out.println("Deleted: " + file.delete());;
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            System.out.println("Created: " + isCreated);
        }
    }
}
