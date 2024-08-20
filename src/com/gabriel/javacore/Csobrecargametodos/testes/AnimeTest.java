package com.gabriel.javacore.Csobrecargametodos.testes;

import com.gabriel.javacore.Csobrecargametodos.dominio.Anime;

public class AnimeTest {
    public static void main(String[] args) {

        // Método (construtor) sobrecarregado

        // nomenclatura this() só funciona dentro de um construtor e sempre deve ser na primeira linha

        Anime anime = new Anime("Naruto", "Tv", 700);

        Anime anime2 = new Anime("Dragon ball", "Tv", 400, "Luta");


    }
}
