package com.gabriel.javacore.Kenums.dominio;

public class Cliente2 {

    private String nome;
    private TipoPagamento tipoPagamento;

    public Cliente2(TipoPagamento tipoPagamento, String nome) {
        this.tipoPagamento = tipoPagamento;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoPagamento getTipoPagamento() {
        return tipoPagamento;
    }

    public void setTipoPagamento(TipoPagamento tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }
}
