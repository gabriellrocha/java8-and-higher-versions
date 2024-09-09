package com.gabriel.javacore.Rdatas.testes;

import java.time.LocalDate;
import java.time.Period;

public class PeriodTest01 {
    public static void main(String[] args) {

        // Period - Representa quantidade de tempo - lida com tempo em: dias, meses, anos
        // Armazena tempo em anos, meses e dias
        // Útil para calcular intervalo de tempo entre datas

        Period period = Period.of(1, 2, 3); // 1 ano, 2 meses, 3 dias
        Period p2 = Period.ofDays(30);
        Period p3 = Period.ofWeeks(58); // armazena em dias - 406 dias neste caso
        Period p4 = Period.ofMonths(3);
        Period p5 = Period.ofYears(6);

        System.out.println(period);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
        System.out.println(p5);

        LocalDate now = LocalDate.now();
        LocalDate after = LocalDate.now().plusYears(2).plusDays(5);

    }
}
