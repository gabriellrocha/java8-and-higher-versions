package com.gabriel.javacore.Sformatacao;

import java.util.Locale;

public class LocalTest02 {
    public static void main(String[] args) {

        String[] countries= Locale.getISOCountries();
        System.out.println("Países Suportados Locale: ");
        for (String c : countries) {
            System.out.print(c + " ");
        }

        System.out.println();

        String[] languages = Locale.getISOLanguages();
        System.out.println("Línguas suportadas pelo Locale: ");
        for (String l : languages) {
            System.out.print(l + " ");
        }
    }
}
