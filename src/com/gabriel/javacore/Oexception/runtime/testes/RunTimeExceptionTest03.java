package com.gabriel.javacore.Oexception.runtime.testes;

public class RunTimeExceptionTest03 {
    public static void main(String[] args) {
        abrirConexaoBD();

    }

    private static void abrirConexaoBD() {

        try {
            System.out.println("Abrindo conexão.......");

        } catch (Exception e) {
            e.printStackTrace();

        } finally { // Sempre é executado independente se ocorra alguma exception
            System.out.println("Fechando recursos liberados pelo SO");
        }

        /* Geralmente o bloco finally é usado quando se abre recursos como arquivos, conexões de BD ou streams,
        * pois após usá-los é necessário fechá-los para evitar vazamento*/

        /* IMPORTANTE: se uma exceção for lançada no bloco finally, ela substituirá qualquer exceção
        * lançada anteriormente no bloco try ou catch*/

    }

}
