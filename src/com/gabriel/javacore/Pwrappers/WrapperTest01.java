package com.gabriel.javacore.Pwrappers;

public class WrapperTest01 {
    public static void main(String[] args) {

        // Wrapper = invólucro (envolver)


        byte byteP = 127;
        short shortP = 10000;
        int intP = 30000;
        long longP = 14000L;
        float floatP = 1F;
        double doubleP = 10D;
        char charP = 'P';
        boolean booleanP = false;

        // Classes que encapsulam os tipos primitivos
        // Útil quando deseja trabalhar com tipos primitivos em contextos que objetos são exigidos -> Coleções

        Byte byteW = 127;
        Short shortW = 10000;
        Integer intW = 30000;
        Long longW = 14000L;
        Float floatW = 1F;
        Double doubleW = 10D;
        Character charW = 'W';
        Boolean booleanW = false;

        // A partir do Java 5
        // autoboxing unboxing, ou seja, conversão automática entre tipos primitivos e seus wrappers

        Integer numero = 5; // autoboxing
        int num = intW;     // unboxing

        int numero2 = 10;
        Integer number = Integer.valueOf(numero2); // antes do Java 5

    }
}
