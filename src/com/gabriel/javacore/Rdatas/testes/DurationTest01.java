package com.gabriel.javacore.Rdatas.testes;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DurationTest01 {
    public static void main(String[] args) {

        // Duration - Representar quantidade de tempo - lida com tempo em: horas, minutos, segundos etc
        // Armazena o tempo em segundos e nanosegundos
        // Datas precisam ser representadas em 'tempo exato', como Instante ou LocalDateTime, LocalTime
        // Útil para calcular intervalo de tempo entre horas

        Instant instantNow = Instant.now();
        Instant instantAfter = Instant.now().plusSeconds(3600); // 1 hora depois

        Duration duration = Duration.between(instantNow, instantAfter);
        System.out.println(duration.getSeconds());

        // Obtém diferença de segundos entre hoje e +30 dias
        long seconds = Duration.between(LocalDateTime.now(), LocalDateTime.now().plusDays(30)).getSeconds();
        System.out.println(seconds);

        System.out.println(Duration.ofHours(3).getSeconds());


    }
}
