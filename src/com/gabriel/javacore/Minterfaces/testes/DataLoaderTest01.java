package com.gabriel.javacore.Minterfaces.testes;

import com.gabriel.javacore.Minterfaces.dominio.DataBaseLoader;
import com.gabriel.javacore.Minterfaces.dominio.DataLoader;
import com.gabriel.javacore.Minterfaces.dominio.FileLoader;

public class DataLoaderTest01 {
    public static void main(String[] args) {

        // Lembre-se quem chama o método é a variável

        DataBaseLoader dbl = new DataBaseLoader();
        dbl.load();

        FileLoader fl = new FileLoader();
        fl.load();


    }
}
