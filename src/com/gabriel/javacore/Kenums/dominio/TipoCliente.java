package com.gabriel.javacore.Kenums.dominio;

public enum TipoCliente {

    // Tipo de classe especial que representa um grupo fixo de constantes.
    // Forma SEGURA de representar constantes e garantir um conjunto de valores específico.
    // Torna o código mais LEGÍVEL e MENOS PROPENSO A ERROS
    // Implicitamente tem um construtor sem argumentos

    // Sõa implicitamente final e static
    PESSOA_FISICA(1),
    PESSOA_JURIDICA(2);

    private final int tipoInt;


    // Posso usar construtor para associar valores adicionais a cada constante
    // O construtor É SEMPRE CHAMADO IMPLICITAMENTE
    private TipoCliente(int tipoInt) {
        this.tipoInt = tipoInt;
    }

    public int getTipoInt(){
        return tipoInt;
    }
}
