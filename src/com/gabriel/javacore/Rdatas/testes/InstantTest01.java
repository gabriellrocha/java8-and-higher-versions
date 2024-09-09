package com.gabriel.javacore.Rdatas.testes;

import java.time.Instant;

public class InstantTest01 {
    public static void main(String[] args) {

        // Instant - representa um ponto instantâneo dentro de uma linha do tempo- Trabalha com nanosegundos

        Instant instant = Instant.now();
        System.out.println(instant);
        System.out.println(instant.getNano());
        System.out.println(Instant.EPOCH); //ponto inicial 1970-01-01T00:00:00Z
        System.out.println(Instant.ofEpochSecond(1)); // adicionar tempo
    }
}
