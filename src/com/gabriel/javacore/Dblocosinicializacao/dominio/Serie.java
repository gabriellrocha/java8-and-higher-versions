package com.gabriel.javacore.Dblocosinicializacao.dominio;

public class Serie {

    private String nome;
    private static int[] episodios;
    private String diretor;

    // Bloco de inicialização de instância
    // É executado SEMPRE que uma nova instância é criada, antes do construtor da classe

//    0 - Bloco static é inicializado quando a JVM carregar a classe
//    1 - Alocado espaço na memória pro objeto
//    2 - Cada atributo da classe é inicializado com os valores default ou valor que for definido
//    3 - Bloco de inicialização de instância
//    4 - Construtor

    static {
        System.out.println("Bloco static executado");
        episodios = new int[10];
    }

    {
        System.out.println("Bloco de inicialização de instância executado");

    }

    public Serie(String nome, String diretor) {
        this.nome = nome;
        this.diretor = diretor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public int[] getEpisodios() {
        return episodios;
    }
}
