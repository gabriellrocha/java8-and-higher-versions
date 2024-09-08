package com.gabriel.javacore.Sformatacao;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class SimpleDateFormatTest01 {
    public static void main(String[] args) {

        // Mais flexível do que DateFormat
        // Classe concreta que extends a classe abstrata DateFormat - não é thread-safe

        // Pesquisar na documentação mais detalhes

        // Tudo que estiver entre aspas simples '' é ignorado
        String pattern1 = "yyyy.MM.dd G 'at' HH:mm:ss z";

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern1);
        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("'Hours:' h:mm a");
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("'Brasil' dd M yyyy H:mm a z");

        String date = simpleDateFormat.format(Calendar.getInstance().getTime());
        System.out.println(date);

        System.out.println(simpleDateFormat1.format(new Date()));
        System.out.println(simpleDateFormat2.format(new Date()));

    }
}
