package com.gabriel.javacore.Minterfaces.dominio;

public class FileLoader implements DataLoader {
    @Override
    public void load() {
        System.out.println("loading from file....");
    }
}
