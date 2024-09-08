package com.gabriel.javacore.Rdatas.testes;

import java.util.Date;

public class DateTest01 {
    public static void main(String[] args) {

        // Antes do Java 8

        // Armazena long - desde 01-01-1970
        Date date = new Date();
        Date date2 = new Date(1_000_000_00000L);
        System.out.println(date2);

        date.setTime(date.getTime() + 3_600_000); // incremento +1hr
        System.out.println(date);
    }
}
