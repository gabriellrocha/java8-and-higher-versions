package com.gabriel.javacore.exercicios.service;

import com.gabriel.javacore.exercicios.domain.Funcionario;

import java.sql.SQLOutput;

public class FuncionarioService {

    public FuncionarioService(){

    }

    public void imprimirInfo(Funcionario funcionario) {

        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("Idade: " + funcionario.getIdade());
        System.out.println("Salários: R$"   + funcionario.getSalarios()[0] + " "
                                            + funcionario.getSalarios()[1] + " "
                                            + funcionario.getSalarios()[2]);
    }

    public void mediaSalarios(Funcionario funcionario) {

        double media = 0.0;
        for (double salario : funcionario.getSalarios()) {
            media += salario;
        }

        System.out.println("Média dos salários do funcionário "
                + funcionario.getNome() + ": R$" + media / funcionario.getSalarios().length);
    }
}
