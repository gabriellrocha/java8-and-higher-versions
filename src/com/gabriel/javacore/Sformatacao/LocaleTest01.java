package com.gabriel.javacore.Sformatacao;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class LocaleTest01 {
    public static void main(String[] args) {

        // ISO - Organização Internacional de Normalização

        // Usada para personalizar datas, números, moedas
        // Baseado na preferência do usuário ou JVM(Onde estiver executando a app)
        // Amplamente utilizada em conjunto com outras classes
        // Usada para adaptar o comportamento de formatação conforme as convenções locais

        // Composto por 3 partes:
        // Idioma: Código ISO 639 da língua. Exemplo: "en" para "inglês"
        // País: Código ISO 3166 do país. Exemplo: "US" para "Estados Unidos"
        // Variante: Opcional, pode específicar variantes regionais ou culturais


        // Personalizando Datas conforme Locale (localização)

        Locale defaultLocal = Locale.getDefault(); // Locale Padrão do Sistema
        Locale localeItaly = new Locale("it", "IT");
        Locale localeCH = new Locale("it", "CH");
        Locale localeJapan = new Locale("ja", "JP");
        Locale localeIndia = new Locale("hi", "IN");



        // Obtém um DateFormat.Full correspondente ao Locale
        DateFormat dateFormatItaly = DateFormat.getDateInstance(DateFormat.FULL, localeItaly);
        DateFormat dateFormatSwitzerland = DateFormat.getDateInstance(DateFormat.FULL, localeCH);
        DateFormat dateFormatJapan = DateFormat.getDateInstance(DateFormat.FULL, localeJapan);
        DateFormat dateFormatIndia = DateFormat.getDateInstance(DateFormat.FULL, localeIndia);


        Date date = Calendar.getInstance().getTime();

        System.out.println("Itália: " + dateFormatItaly.format(date));
        System.out.println("Suíça: " + dateFormatSwitzerland.format(date));
        System.out.println("Japão: " + dateFormatJapan.format(date));
        System.out.println("India: " + dateFormatIndia.format(date));


    }
}
