package com.gabriel.javacore.Minterfaces.dominio;

public interface DataLoader {

    public static final String TEXTO = "Eu sou uma constante";

    // Interfaces são um CONTRATO que definem um conjunto de métodos que uma classe DEVE implementar
    // Permitem a definição de COMPORTAMENTOS COMUNS para diferentes classes SEM IMPOR uma implementação específica

    // A partir do JAVA 8 podem ter métodos default e static
    // Método default -> Implementação padrão fornecida diretamente na interface
    // Método static -> Podem ser chamados usando a interface (não pode ser sobrescritos por classes que implementam a interface)

    // Por default implicitamente os métodos de uma interface são public abstract ou público default

    void load();

    default void checkPermission(){
        System.out.println("checando permissões.....");
    }

    public static void imprimir(){
        System.out.println("Método static. Não posso ser sobrescrito");
    }

}
