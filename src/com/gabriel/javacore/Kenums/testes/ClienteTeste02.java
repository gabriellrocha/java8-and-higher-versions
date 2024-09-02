package com.gabriel.javacore.Kenums.testes;

import com.gabriel.javacore.Kenums.dominio.Cliente2;
import com.gabriel.javacore.Kenums.dominio.TipoPagamento;

public class ClienteTeste02 {
    public static void main(String[] args) {

        Cliente2 cliente = new Cliente2(TipoPagamento.DEBITO, "Gabriel");
        Cliente2 cliente2 = new Cliente2(TipoPagamento.CREDITO, "João");

        // Ou seja,
        System.out.println( cliente.getTipoPagamento().calcularDesconto(100));
        System.out.println( cliente2.getTipoPagamento().calcularDesconto(150));

    }
}
