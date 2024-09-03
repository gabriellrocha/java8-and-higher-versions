package com.gabriel.javacore.Minterfaces.dominio;

public interface DataLoader {

    // Interfaces são um CONTRATO que definem um conjunto de métodos que uma classe DEVE implementar
    // Permitem a definição de COMPORTAMENTOS COMUNS para diferentes classes SEM IMPOR uma implementação específica

    // A partir do JAVA 8 podem ter métodos default e static
    // Método default -> Implementação padrão fornecida diretamente na interface
    // Método static -> Podem ser chamados usando a interface (não pode ser sobrescritos por classes que implementam a interface)

    // Por default implicitamente os métodos de uma interface são public abstract ou público default

    void load();

}
