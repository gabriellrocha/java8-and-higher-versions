package com.gabriel.javacore.Tresourcebundle.testes;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResoucerBundleTest01 {
    public static void main(String[] args) {

        System.out.println(Locale.getDefault());

        // ResourceBundle - usada para carregar e acessar recursos localizados
        // Facilita a internacionalização (i18n) da aplicação

        ResourceBundle resourceBundleBR = ResourceBundle.getBundle("mensagens", Locale.getDefault());
        resourceBundleBR.containsKey("name");
        System.out.println(resourceBundleBR.getString("good.morning"));


        ResourceBundle resourceBundleUS = ResourceBundle.getBundle("mensagens", new Locale("en", "US"));
        System.out.println(resourceBundleUS.getString("good.morning"));

        // consulte como funciona o fallback encontrar o resource bundle .properties

    }
}
