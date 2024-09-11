package com.gabriel.javacore.Uregex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest01 {

    public static void main(String[] args) {

        // Regex - (expressão regular) é uma sequência de caracteres que define um 'padrão de pesquisa'
        // Usado para definir padrões que podem ser usados para: buscar, validar, substituir, extrair

        // Alguns meta caracteres

        // \d = todos os digitos
        // \D = tudo o que não for digito
        // \s = todos os espaços em branco \t \n \f \r
        // \S = todos os caracteres excluindo os brancos
        // \w = a-z A-Z todos os dígitos _(underscores)
        // \W tudo que não incluso no \w

        String regex = "\\W";
        String texto = "hhJ21@2gv H21kh2#ASq";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        while (matcher.find()) {
            System.out.print("Index: " + matcher.start() + " -> " + matcher.group() +" \n");
        }


    }
}
