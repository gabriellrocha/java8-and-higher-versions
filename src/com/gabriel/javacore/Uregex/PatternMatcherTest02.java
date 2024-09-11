package com.gabriel.javacore.Uregex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest02 {

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

        String regex3 = "0[xX]([0-9a-fA-F])+(\\s|$)"; // regex para hexadecimal

        String texto = "12 0x 0X 0xFFABC 0x10G 0x1 ";

        Pattern pattern = Pattern.compile(regex3);
        Matcher matcher = pattern.matcher(texto);
        while (matcher.find()) {
            System.out.print("Index: " + matcher.start() + " -> " + matcher.group() +" \n");
        }



        int numeroHex = 0x51419DB; // número em HEXADECIMAL no Java começa com 0x ou 0X
        System.out.println(numeroHex);
    }
}
