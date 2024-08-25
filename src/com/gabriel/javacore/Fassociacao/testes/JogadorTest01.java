package com.gabriel.javacore.Fassociacao.testes;

import com.gabriel.javacore.Fassociacao.dominio.Jogador;
import com.gabriel.javacore.Fassociacao.dominio.Time;

public class JogadorTest01 {
    public static void main(String[] args) {


        // Associação Unidirecional 1..1 - UM jogador joga em UM TIME

        Time time = new Time("São Paulo");
        Jogador jogador = new Jogador("Gabriel", time);

        jogador.imprimir();

    }
}
