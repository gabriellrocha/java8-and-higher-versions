package com.gabriel.javacore.Rdatas.testes;

import java.time.LocalDate;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;


public class TemporalAdjustersTest01 {

    public static void main(String[] args) {

        // TemporalAdjusters - fornece métodos estáticos para ajustes de data e hora
        // Útil para aplicar alterações personalizadas a um objeto Temporal

        LocalDate localDate = LocalDate.now();
        localDate = localDate.plusDays(25); // incremento 09-09-2024 vira 04-10-2024

        LocalDate localDate1 = LocalDate.now();
        localDate1 = localDate1.withDayOfMonth(25); // substitui apenas o campo informado, neste caso o dia 2024-09-09 vira 2024-09-25

        LocalDate ld = LocalDate.now().with(TemporalAdjusters.firstDayOfMonth()); // reajusta a data para 1.º dia do mês


    }
}
