package com.gabriel.javacore.Rdatas.testes;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.temporal.TemporalAmount;

public class LocalDateTest01 {
    public static void main(String[] args) {

        // Java 8 - API DateTime
        // LocalDate - Apenas informações relativas a uma Data, sem conteúdo de horário -ISO 8601

        LocalDate localDate0 = LocalDate.now(); // 2024-09-08
        LocalDate localDate1 = LocalDate.of(1999, Month.JULY, 30); // 1999-07-30

        System.out.println(localDate1.getDayOfMonth());
        System.out.println(localDate1.isLeapYear()); // É bissexto?
        System.out.println(localDate1.getMonth()); // JULY
        System.out.println(localDate1.plus(Period.ofWeeks(2))); //1999-08-13

    }
}
