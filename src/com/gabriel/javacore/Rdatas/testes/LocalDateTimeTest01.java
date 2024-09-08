package com.gabriel.javacore.Rdatas.testes;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class LocalDateTimeTest01 {
    public static void main(String[] args) {

        // LocalDateTime - Contém informações de data e horário - ISO 8601

        LocalDateTime localDateTime0 = LocalDateTime.now(); // 2024-09-08T18:59:06.814
        LocalDateTime localDateTime1 = LocalDateTime.of(2024, Month.DECEMBER, 31, 12, 30); // 2024-12-31T12:30

        LocalTime localTime = LocalTime.parse("19:10");
        LocalDate localDate = LocalDate.parse("2024-09-08");


        // LocalDate + LocalTime = LocalDateTime
        LocalDateTime localDateTime = localTime.atDate(localDate);
        LocalDateTime localDateTime2 = localDate.atTime(localTime);

    }
}
