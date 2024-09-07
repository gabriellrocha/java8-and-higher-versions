package com.gabriel.javacore.Oexception.exception.testes;

import com.gabriel.javacore.Oexception.exception.dominio.LoginInvalidException;

import java.util.Scanner;

public class ExceptionPersonalizadaTest01 {
    public static void main(String[] args) {

        try {
            fazerLogin();
        } catch (LoginInvalidException e) {
            System.out.println("App não é encerrada abruptamente, pois a exception foi \"tratada\"");
            e.printStackTrace();
        }

    }

    public static void fazerLogin() throws LoginInvalidException {
        String usernameBD = "Kakashi";
        String senha = "hatake";

        Scanner scanner = new Scanner(System.in);

        System.out.println("Usuário:");
        String user = scanner.nextLine();

        System.out.println("Senha:");
        String password = scanner.nextLine();

        if (!user.equals(usernameBD) || !password.equals(senha)) {
            throw new LoginInvalidException();
        }

        System.out.println("Login realizado com sucesso!");
    }
}
