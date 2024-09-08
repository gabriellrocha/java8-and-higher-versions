package com.gabriel.javacore.Rdatas.testes;

import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalField;


public class LocalTimeTest01 {
    public static void main(String[] args) {

        // LocalTime - Apenas informações de horário com precisão de nanosegundos, sem componentes de uma data - ISO 8601

        LocalTime localTime0 = LocalTime.now(); // 18:47:18.374
        LocalTime localTime1 = LocalTime.of(22, 30, 12); // 22:30:12

        System.out.println(localTime0.getHour());
        System.out.println(localTime0.getMinute());
        System.out.println(localTime0.getSecond());
        System.out.println(LocalTime.MAX);
        System.out.println(LocalTime.MIN);
    }
}
