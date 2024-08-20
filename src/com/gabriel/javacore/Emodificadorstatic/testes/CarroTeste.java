package com.gabriel.javacore.Emodificadorstatic.testes;

import com.gabriel.javacore.Emodificadorstatic.domain.Carro;

public class CarroTeste {

    public static void main(String[] args) {

        Carro.setVelocidadeMaxima(180);

        Carro carro1 = new Carro("BMW");

        System.out.println(carro1.getMarca());
        System.out.println(Carro.getVelocidadeMaxima());

        /*Exemplos de quando é recomendável usar membros static, seguindo as boas práticas?
            1 - Quando um valor É CONSTANTE e NÃO varia entre instâncias
            2 - Funções que não dependem de dados de instância, como métodos de calculo, exemplo Math.max()
            3 - Dentre outros...
        * */

    }
}
