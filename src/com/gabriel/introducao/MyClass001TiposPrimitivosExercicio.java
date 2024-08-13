package com.gabriel.introducao;/*
Prática
Crie variáveis para os campos descritivos entre <> e imprima a seguinte mensagem:

Eu <nome>, morando no endereço <endereço>,
confirmo que recebi o salário <salário> na data <data>.
* */

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class MyClass001TiposPrimitivosExercicio {
    public static void main(String[] args) {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        String nome = "Gabriel";
        String endereco = "Campinas-SP";
        double salario = 3000D;
        LocalDate data = LocalDate.now(); // 2024-08-13 (formato ISO-8601)

        System.out.printf("Eu %s, morando no endereço %s," +
                          " confirmo que recebi o salário %.2f na data %s.", nome, endereco, salario, data.format(formatter));

    }
}
