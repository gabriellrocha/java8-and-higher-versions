package com.gabriel.javacore.Lclassesabstratas.dominio;

import com.gabriel.javacore.Lclassesabstratas.enums.Departamento;

import java.math.BigDecimal;

public class Gerente extends Funcionario {

    private Departamento departamento;

    public Gerente(String nome, BigDecimal salario, Departamento departamento) {
        super(nome, salario);
        this.departamento = departamento;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + "\nSalário R$" + salario + "\nDepartamento: " + departamento;

    }
}
