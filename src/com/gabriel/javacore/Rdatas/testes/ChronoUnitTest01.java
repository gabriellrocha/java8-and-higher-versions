package com.gabriel.javacore.Rdatas.testes;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class ChronoUnitTest01 {
    public static void main(String[] args) {

        // ChronoUnit - Enum - Define unidades de tempo específicas
        // Fornece métodos para calcular diferenças e adicionar ou subtrair essas unidades a partir de datas e horas

        LocalDate nascimento = LocalDate.parse("1999-07-30");
        LocalDate now = LocalDate.now();

        // Calcula diferença entre duas datas...
        System.out.println(ChronoUnit.YEARS.between(nascimento, now)); //.... em anos
        System.out.println(ChronoUnit.MONTHS.between(nascimento, now)); //.... em meses
        System.out.println(ChronoUnit.WEEKS.between(nascimento, now)); //.... em semanas
        System.out.println(ChronoUnit.DAYS.between(nascimento, now)); //.... em dias


        // Calcula diferença entre intervalos de tempo
        LocalTime start = LocalTime.of(12, 30);
        LocalTime end = LocalTime.of(23, 30);

        System.out.println(ChronoUnit.MINUTES.between(start, end));
        System.out.println(ChronoUnit.SECONDS.between(start, end));

    }
}
