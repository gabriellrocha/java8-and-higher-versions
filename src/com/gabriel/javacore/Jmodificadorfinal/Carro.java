package com.gabriel.javacore.Jmodificadorfinal;

public class Carro {

    // Atributo marcado como final é aquele cujo valor não pode ser alterado após ser inicializado
    // Constante
    public static final double VELOCIDADE_LIMITE = 250.0;
    public static final int QUANTIDADE_PORTAS;


    // Atributo do tipo referência marcado como final, não pode "apontar" para outra referência, mas o Objeto em si
    // pode alterar seu estado (valores internos)

    // Ou seja, o comprador aqui não pode ser alterado
    private final Comprador COMPRADOR = new Comprador("Gabriel");


    static {
        // É possível inicializar uma variável final desta forma, pois o Bloco 'static' é carregado antes dos atributos pela JVM
        QUANTIDADE_PORTAS = 4;
    }

}
