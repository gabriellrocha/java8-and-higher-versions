package com.gabriel.javacore.Rdatas.testes;

import javax.jws.soap.SOAPBinding;
import java.util.Calendar;
import java.util.Date;

public class CalenderTest01 {
    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar); // muita informações

        Date date = calendar.getTime(); // data 'formatada'
        System.out.println(date);

        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
        System.out.println(calendar.get(Calendar.HOUR));
        System.out.println(calendar.get(Calendar.WEEK_OF_MONTH));

        calendar.add(Calendar.HOUR_OF_DAY, 2); // incremento 2+hr
        System.out.println(calendar.getTime());

    }
}
