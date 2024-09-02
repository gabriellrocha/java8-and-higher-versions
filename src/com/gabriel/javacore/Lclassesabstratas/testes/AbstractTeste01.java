package com.gabriel.javacore.Lclassesabstratas.testes;

import com.gabriel.javacore.Lclassesabstratas.dominio.Gerente;
import com.gabriel.javacore.Lclassesabstratas.enums.Departamento;

import java.math.BigDecimal;

public class AbstractTeste01 {
    public static void main(String[] args) {

        Gerente gerente = new Gerente("Gabriel", new BigDecimal(8000), Departamento.TECNOLOGIA);

        System.out.println(gerente);

    }
}
