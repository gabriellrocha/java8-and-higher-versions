package com.gabriel.javacore.Npolimorfismo.testes;

import com.gabriel.javacore.Npolimorfismo.dominio.Computador;
import com.gabriel.javacore.Npolimorfismo.dominio.Geladeira;
import com.gabriel.javacore.Npolimorfismo.dominio.Produto;
import com.gabriel.javacore.Npolimorfismo.service.CalculadoraImposto;

public class PolimorfismoTest01 {
    public static void main(String[] args) {

        // É a capacidade de um objeto ter vários tipos dependendo do contexto
        // A variável pode ser de tipo diferente em contextos diferentes
        // variável 'produto' pode assumir diferentes tipos (geladeira, computador) ou seja, tudo que herda da Classe produto

        // Polimorfismo = múltiplas formas


        Produto produto;

        produto = new Computador("ACER", 4000.0, 0.20);
        CalculadoraImposto.calculoImposto(produto);

        System.out.println("------------------------------------------------------------");

        produto = new Geladeira("Consul", 5000.0, 0.15);
        CalculadoraImposto.calculoImposto(produto);


    }
}
