package com.gabriel.javacore.Npolimorfismo.service;

import com.gabriel.javacore.Npolimorfismo.dominio.Produto;

public class CalculadoraImposto {

    public static void calculoImposto(Produto produto) {

        // método polimórfico - Se comporta dependendo do tipo real que a variável 'produto' esta referênciando

        System.out.println("Relatório Imposto");
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Valor do imposto: " + produto.getPreco() * produto.getTaxa());
    }
}
