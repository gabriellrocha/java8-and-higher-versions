package com.gabriel.javacore.Hheranca.dominio;

public class Funcionario extends Pessoa {

    private Double salario;

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println(salario);
    }

    public void imprimir2() {
        // modificador protected permite o acesso aos membros em SUBCLASSES e em outras classes do MESMO PACKAGE
        System.out.println(this.nome);
        System.out.println(this.idade);
        System.out.println(this.salario);
    }

}
