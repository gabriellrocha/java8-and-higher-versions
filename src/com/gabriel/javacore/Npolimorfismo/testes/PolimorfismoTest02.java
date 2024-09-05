package com.gabriel.javacore.Npolimorfismo.testes;

import com.gabriel.javacore.Npolimorfismo.dominio.Computador;
import com.gabriel.javacore.Npolimorfismo.dominio.Produto;
import com.gabriel.javacore.Npolimorfismo.dominio.Tomate;
import com.gabriel.javacore.Npolimorfismo.service.CalculadoraImposto;

import java.time.LocalDate;

public class PolimorfismoTest02 {
    public static void main(String[] args) {


        Tomate tomate = new Tomate("Tomate especial", 5.50, 0.04, LocalDate.now());
        Computador computador = new Computador("Nitro 5", 4000.0, 0.17);

        CalculadoraImposto.calculoImposto(tomate);

        System.out.println("---------------------------------------------------------------------------");

        CalculadoraImposto.calculoImposto(computador);


    }
}
