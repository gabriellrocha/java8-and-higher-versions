package com.gabriel.javacore.Npolimorfismo.service;

import com.gabriel.javacore.Npolimorfismo.dominio.Computador;
import com.gabriel.javacore.Npolimorfismo.dominio.Produto;
import com.gabriel.javacore.Npolimorfismo.dominio.Tomate;

public class CalculadoraImposto {

    public static void calculoImposto(Produto produto) {

        // método polimórfico - Se comporta dependendo do tipo real que a variável 'produto' esta referênciando

        System.out.println("Relatório Imposto");
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Valor do imposto: " + produto.getPreco() * produto.getTaxa());

        if (produto instanceof Tomate) { // Narrowing cast -> Processo de converter um tipo de dado maior em um menor
            Tomate tomate = (Tomate) produto;
            System.out.println("Data vencimento: " + tomate.getVencimento());
        }

        // Operador 'instanceof' verifica se um objeto é uma instância de uma classe/interface

        //  Widening cast -> Converte um tipo de dado inferior a um superior. Exemplos:
        //  tipo referência - subclass em superclass
        //  tipo primitivos - int(4bytes) em double(8bytes)


    }
}
