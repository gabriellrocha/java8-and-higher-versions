package com.gabriel.javacore.Bintroducaometodos.testes;

import com.gabriel.javacore.Aintroducaoclasses.dominio.Estudante;

public class ImpressoraEstudante {
    public static void main(String[] args) {

        Estudante estudante1 = new Estudante();

        imprimiNomeEstudante(estudante1); // output null

        // Uma cópia da referência é passada para o método
        modificaNome(estudante1);

        imprimiNomeEstudante(estudante1); // output Calouro

    }

    private static void imprimiNomeEstudante(Estudante estudante){
        System.out.println(estudante.nome);
    }

    // muda o estado do objeto
    private static void modificaNome(Estudante estudante) {

        //estudante1 também é modificado, pois ambas referências "apontam" para o mesmo objeto
        estudante.nome = "Calouro!";
    }

}
