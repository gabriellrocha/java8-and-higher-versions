package com.gabriel.javacore.Sformatacao;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatCurrencyTest02 {
    public static void main(String[] args) {

        // Personalizando moeda$ conforme Locale (localização)

        NumberFormat[] numberFormats = new NumberFormat[4];

        Locale localeBrasil = new Locale("pt", "BR");
        Locale localeJapan = Locale.JAPAN;  // forma concisa de criar um Locale - é o mesmo que new Locale("ja", "JP");
        Locale localeUS = Locale.US;
        Locale localeItaly = Locale.ITALY;

        numberFormats[0] = NumberFormat.getCurrencyInstance(localeBrasil);
        numberFormats[1] = NumberFormat.getCurrencyInstance(localeJapan);
        numberFormats[2] = NumberFormat.getCurrencyInstance(localeUS);
        numberFormats[3] = NumberFormat.getCurrencyInstance(localeItaly);

        double valor = 100_000_000_20D;

        for (NumberFormat numberFormat : numberFormats) {
            System.out.println(numberFormat.format(valor));
        }
    }
}
