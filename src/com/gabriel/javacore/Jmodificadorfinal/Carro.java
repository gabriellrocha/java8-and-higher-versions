package com.gabriel.javacore.Jmodificadorfinal;

public class Carro {

    // Atributo marcado como final é aquele cujo valor não pode ser alterado após ser inicializado
    // Constante
    public static final double VELOCIDADE_LIMITE = 250.0;
    public static final int QUANTIDADE_PORTAS;

    static {
        // É possível inicializar uma variável final desta forma, pois o Bloco 'static' é carregado antes dos atributos pela JVM
        QUANTIDADE_PORTAS = 4;
    }

}
