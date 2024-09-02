package com.gabriel.javacore.Kenums.testes;

import com.gabriel.javacore.Kenums.dominio.Cliente;
import com.gabriel.javacore.Kenums.dominio.TipoCliente;

public class ClienteTeste01 {

    public static void main(String[] args) {

        Cliente cliente = new Cliente("Gabriel", TipoCliente.PESSOA_FISICA);
        Cliente cliente2 = new Cliente("Gabriel", TipoCliente.PESSOA_JURIDICA);

        Cliente cliente3 = new Cliente("Maria",TipoCliente.PESSOA_FISICA);

        System.out.println(cliente);
        System.out.println(cliente2);

        System.out.println(cliente3);
        System.out.println(cliente3.getTipoCliente().getTipoInt());


    }
}
