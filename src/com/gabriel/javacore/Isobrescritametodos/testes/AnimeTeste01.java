package com.gabriel.javacore.Isobrescritametodos.testes;

import com.gabriel.javacore.Isobrescritametodos.dominio.Anime;

public class AnimeTeste01 {

    public static void main(String[] args) {

        Anime anime = new Anime("Naruto");
        System.out.println(anime);

        // Toda classe no Java Herda de Object
        // Por padrão Object possui alguns métodos, dentre eles, o toString()

        // Ao pedir para "imprimir" uma variável do tipo Referência, o Java implicitamente chama o toString()
        // Ou seja, podemos fazer a sobrescrita na nossa classe e personalizá-lo

        // Sobrescrita de método deve respeitar a assinatura: determinada pelo nome e pela lista de parâmetros (tipos, quantidade e ordem).
    }
}
