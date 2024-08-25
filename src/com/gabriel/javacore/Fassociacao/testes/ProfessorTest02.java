package com.gabriel.javacore.Fassociacao.testes;

import com.gabriel.javacore.Fassociacao.dominio.Escola;
import com.gabriel.javacore.Fassociacao.dominio.Professor;

public class ProfessorTest02 {
    public static void main(String[] args) {


        Professor professor1 = new Professor("Girafales");
        Professor professor2 = new Professor("Clóvis");
        Professor professor3 = new Professor("Geraldo");

        // Associação Unidirecional 1..N - UMA escola tem VÁRIOS professores
        Escola escola = new Escola("Mário coelho", professor1, professor2, professor3);

    }
}
