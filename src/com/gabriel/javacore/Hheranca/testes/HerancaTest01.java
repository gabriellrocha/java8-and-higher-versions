package com.gabriel.javacore.Hheranca.testes;

import com.gabriel.javacore.Hheranca.dominio.Funcionario;

public class HerancaTest01 {
    public static void main(String[] args) {

        // O conceito de herança consiste em herdar membros de outra classe conhecida como superclasse
        // A classe que herda é conhecida como subclasse
        // Cuidado com o uso excessivo por conta do forte acoplamento

        Funcionario funcionario = new Funcionario(); // Funcionário extends Pessoa

        funcionario.setNome("Gabriel");
        funcionario.setSalario(8000.0);

        System.out.println(funcionario.getSalario());
    }
}
