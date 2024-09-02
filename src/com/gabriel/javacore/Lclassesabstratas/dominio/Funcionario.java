package com.gabriel.javacore.Lclassesabstratas.dominio;

import java.math.BigDecimal;

public abstract class Funcionario {

    // Funcionalidade de uma class abstract é ser extends, ou seja, ser usada no contexto de herança
    // É uma prática de design de código
    // Não podem ser instânciadas diretamente
    // Existem para servir como base para outras classes (Template)
    // Podem ter métodos com implementação padrão ou que precisam ser implementados por subclasses

    // Usada para garantir que um conjunto de classes relacionadas compartilhem um interface em comum ou comportamento básico

    protected String nome;
    protected BigDecimal salario;

    public Funcionario(String nome, BigDecimal salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }
}
