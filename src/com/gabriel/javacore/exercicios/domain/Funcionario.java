package com.gabriel.javacore.exercicios.domain;

public class Funcionario {

    private String nome;
    private int idade;
    // garante que não vai "apontar" para outro array em tempo de execução, no entanto, não impede que o conteúdo seja modificado
    private final double [] salarios = new double[3];

    public Funcionario(String nome, int idade, double[] salarios) {
        this.nome = nome;
        this.idade = idade;
        setSalarios(salarios);
    }

    private void setSalarios(double[] salarios) {
        // validação
        if (salarios != null) {
            this.salarios[0] = salarios[0];
            this.salarios[1] = salarios[1];
            this.salarios[2] = salarios[2];
        }
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double[] getSalarios() {
        return salarios;
    }
}
