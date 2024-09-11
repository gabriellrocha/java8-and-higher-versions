package com.gabriel.javacore.Uregex;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest03 {

    public static void main(String[] args) {

        // [] Range - conjunto de caracteres - [abc] procure por a, b ou c - case sensitive

        // Quantificadores - definem quantas vezes um padrão deve ocorrer para haver uma correspondência
        // ? 0 ou uma
        // * 0 ou mais
        // + uma ou mais
        // {n, m} de n até m
        // () agrupamento
        // | o(v/c)o ovo ou oco
        // $ fim da linha
        // . coringa (qualquer caractere)

        String regex3 = "([a-zA-Z0-9\\._-])+@([a-zA-Z])+(\\.([a-zA-Z]+))+";

        String texto = "gabriell_rsilva@outlook.com luffy@hotmail.com #@!zoro@mail.com  sakura@mail.com.br 123jota@gmail.com";

        Pattern pattern = Pattern.compile(regex3);
        Matcher matcher = pattern.matcher(texto);

        while (matcher.find()) {
            System.out.print("Index: " + matcher.start() + " -> " + matcher.group() +" \n");
        }

        System.out.println("@!zoro@mail.com".matches(regex3));

    }
}
