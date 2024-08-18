package com.gabriel.javacore.exercicios.testes;

import com.gabriel.javacore.exercicios.domain.Funcionario;
import com.gabriel.javacore.exercicios.service.FuncionarioService;

public class MainFuncionario {
    /* Crie uma classe funcionário com os atributos: nome, idade e salario → 3 salários devem ser guardados
    *  Crie dois métodos para:
    *   → Imprimir os dados
    *   → Tirar a média dos salários e imprimir o resultado*/

    public static void main(String[] args) {


        Funcionario funcionario = new Funcionario("Gabriel", 25, new double[]{4500.0, 3800.0, 2900});

        FuncionarioService service = new FuncionarioService();

        service.imprimirInfo(funcionario);

        service.mediaSalarios(funcionario);

    }
}
