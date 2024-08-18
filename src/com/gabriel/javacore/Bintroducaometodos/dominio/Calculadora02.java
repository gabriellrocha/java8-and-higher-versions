package com.gabriel.javacore.Bintroducaometodos.dominio;

public class Calculadora02 {

    public int somarArray(int[] numeros) {
        int soma = 0;
        for(int num : numeros){
            soma += num;
        }
        return soma;
    }

    public int somarVarargs(int... numeros) {

        // Nos "bastidores" o Java trata o varargs como um array

        int soma = 0;
        for(int num : numeros){
            soma += num;
        }
        return soma;
    }

    // Combinação com outros parâmetros, DESDE QUE, o varargs seja o último (apenas um varargs por método)
    public void somarNumerosImprimiMensagem(String mensagem, int... numeros) {
        // Este método faz "duas coisas" nunca faça isso hahaha (apenas para fins didáticos)

        int soma = 0;
        for(int num : numeros) {
            soma += num;
        }
        System.out.println(mensagem + " " + soma);
    }

}
