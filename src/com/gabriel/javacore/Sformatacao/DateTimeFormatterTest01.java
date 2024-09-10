package com.gabriel.javacore.Sformatacao;

import javax.jws.soap.SOAPBinding;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateTimeFormatterTest01 {
    public static void main(String[] args) {

        // DateTimeFormatter - Permite formatar datas e horas
        // mais atual e recomendada para manipulação de datas e horas - api date-time java 8+

        // format - do Objeto para String | parse - de String para Objeto
        // Usando constante pre-definidas ou usando padrão de letras

        // Usando constantes
        LocalDate localDate = LocalDate.now(); // 2024-09-10
        String stringDate = localDate.format(DateTimeFormatter.BASIC_ISO_DATE); //20240910

        LocalDateTime localDateTime = LocalDateTime.parse("2024-09-10T10:50:40.140", DateTimeFormatter.ISO_DATE_TIME);


        // Usando pattern letters
        DateTimeFormatter formatterBR = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formatterUS = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        DateTimeFormatter formatterJP = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        DateTimeFormatter[] dateTimeFormatters = new DateTimeFormatter[3];

        dateTimeFormatters[0] = formatterBR;
        dateTimeFormatters[1] = formatterUS;
        dateTimeFormatters[2] = formatterJP;

        // LocalDate para String
        for (DateTimeFormatter dt : dateTimeFormatters) {
            System.out.println(LocalDate.now().format(dt));
        }

        // String para LocalDate
        LocalDate parse = LocalDate.parse("10/09/2024", formatterBR);

        DateTimeFormatter dtGermany = DateTimeFormatter.ofPattern("dd.MMMM.yyyy", Locale.GERMANY);

        // Cria uma String a partir de uma Data no formado alemão
        String stringLocalDateGermany = LocalDate.now().format(dtGermany);

        // Cria um LocalDate a partir de uma String no formato alemão
        LocalDate parseGermany = LocalDate.parse("10.September.2024", dtGermany);


    }
}
