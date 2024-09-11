package com.gabriel.javacore.Uregex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ScannerTest01 {
    public static void main(String[] args) {

        // Scanner - Usada para ler entrada de dados a partir de várias fontes - teclado, arquivo, strings.

        String teste = "Gabriel4Maria6Fatima9";
        String teste2 = "gabriel true 18 joao false 10";

        String[] strings = teste.split("\\d");
        for (String s : strings) {
            System.out.println(s.trim());
        }

        // lendo de string
        Scanner scanner = new Scanner(teste);
        scanner.useDelimiter(Pattern.compile("\\d"));

        while (scanner.hasNext()) {
            System.out.println(scanner.next());
        }

        // Obtendo valor de acordo o tipo
        Scanner scanner1 = new Scanner(teste2);
        while (scanner1.hasNext()) {
            if(scanner1.hasNextInt()) {
                System.out.println("int " + scanner1.nextInt());
            } else if (scanner1.hasNextBoolean()) {
                System.out.println("boolean: " + scanner1.nextBoolean());
            } else {
                System.out.println("Outro tipo: " + scanner1.next());
            }
        }

    }
}
