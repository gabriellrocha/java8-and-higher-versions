package com.gabriel.javacore.Oexception.exception.dominio;

import java.io.IOException;

public class Filho extends Pai {

    // Em métodos sobrescritos a regras específicas para uso de exceptions VERIFICADAS (checked)

    // Essas exceções não são 'herdadas' diretamente, mas o método sobrescrito precisa seguir certas restrições:

    // Se o método na classe Pai não lançar checked exception, o método sobrescrito também não pode
    // Não pode lançar exceptions verificadas(checked) NOVAS ou mais GENÉRICAS
    // Pode lançar AS MESMAS exceções ou SUBCLASSES das exceções declaradas no método pai

    @Override
    public void falar() throws IOException {

    }


    // Para exceptions que herdam de RunTimeException (unchecked), não há restrições
    // O método sobrescrito pode lançar exceções não verificadas livremente, mesmo que o método na classe pai não declare
    @Override
    public void comer() throws RuntimeException {

    }
}
