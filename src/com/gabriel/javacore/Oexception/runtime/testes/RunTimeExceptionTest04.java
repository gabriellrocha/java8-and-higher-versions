package com.gabriel.javacore.Oexception.runtime.testes;

import java.io.IOException;
import java.sql.SQLException;

public class RunTimeExceptionTest04 {
    public static void main(String[] args) {

    try {
        canLaunchException();

    } catch (Exception e) { // Polimorfismo - Possibilidade de capturar ambas, pois são filhas de Exception
        e.printStackTrace();
    }


    try {
        throw new RuntimeException();

    } catch (IndexOutOfBoundsException e) {
        System.out.println("Dentro do IndexOutOfBoundsException");
    } catch (ArithmeticException e) {
        System.out.println("Dentro do ArithmeticException");

    } catch (RuntimeException e) { // Tipo mais genérico sempre por último
        System.out.println("Dentro do RunTimeException");
    }


    }

    private static void canLaunchException() throws IOException, SQLException {

    }


}
