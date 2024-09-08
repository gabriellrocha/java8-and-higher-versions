package com.gabriel.javacore.Rdatas.testes;

import java.text.DateFormat;
import java.util.Calendar;


public class DateFormatTest01 {
    public static void main(String[] args) {

        // Antes do Java 8

        Calendar calendar = Calendar.getInstance();
        DateFormat[] dateFormats = new DateFormat[7];

        // DateFormat
        // Converte Objetos 'Date' em 'String' no formato desejado
        // Converte uma 'String' que representa uma Data em um Objeto 'Date'

        dateFormats[0] = DateFormat.getInstance();  // 08/09/24 12:51
        dateFormats[1] = DateFormat.getDateInstance(); // 08/09/2024
        dateFormats[2] = DateFormat.getTimeInstance(); // 12:51:17

        dateFormats[3] = DateFormat.getDateInstance(DateFormat.SHORT); // 08/09/24
        dateFormats[4] = DateFormat.getDateInstance(DateFormat.MEDIUM); // 08/09/2024
        dateFormats[5] = DateFormat.getDateInstance(DateFormat.LONG); // 8 de setembro de 2024
        dateFormats[6] = DateFormat.getDateInstance(DateFormat.FULL); // Domingo, 8 de setembro de 2024

        for(DateFormat df : dateFormats) {
            System.out.println(df.format(calendar.getTime()));
        }


    }
}
