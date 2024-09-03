package com.gabriel.javacore.Minterfaces.dominio;

public class DataBaseLoader implements DataLoader {
    @Override
    public void load() {
        System.out.println("loading from database...");
    }

    @Override
    public void checkPermission() {
        System.out.println("checando permissões para database...");;
    }
}
