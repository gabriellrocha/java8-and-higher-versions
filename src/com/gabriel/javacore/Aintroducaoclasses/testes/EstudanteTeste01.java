package com.gabriel.javacore.Aintroducaoclasses.testes;

import com.gabriel.javacore.Aintroducaoclasses.dominio.Estudante;

public class EstudanteTeste01 {
    public static void main(String[] args) {

        Estudante estudante = new Estudante();
        estudante.idade = 25;
        estudante.nome = "Gabriel";
        estudante.sexo = 'M';

        System.out.println("Nome: " + estudante.nome);
        System.out.println("Idade: " + estudante.idade);
        System.out.println("Sexo: "+ estudante.sexo);
    }
}
