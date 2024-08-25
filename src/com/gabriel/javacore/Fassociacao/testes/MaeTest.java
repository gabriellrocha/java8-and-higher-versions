package com.gabriel.javacore.Fassociacao.testes;

import com.gabriel.javacore.Fassociacao.dominio.Filho;
import com.gabriel.javacore.Fassociacao.dominio.Mae;

public class MaeTest {
    public static void main(String[] args) {

        Mae mae = new Mae("Maria");

        Filho filho1 = new Filho("Joana");
        Filho filho2 = new Filho("Pedro");
        Filho filho3 = new Filho("Rebeca");

        // // Associação Bidirecional 1..N - UMA MAE tem VÁRIOS filhos
        // Garantindo a bidirecionalidade no Java, mas não no BD

        mae.setFilho(filho1);
        mae.setFilho(filho1);
        mae.setFilho(filho1);

        System.out.println(filho1.getMae().getNome());
    }
}
