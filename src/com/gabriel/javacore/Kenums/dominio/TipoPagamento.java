package com.gabriel.javacore.Kenums.dominio;

public enum TipoPagamento {

    // Sobrescrita em Enum permite definir implementações específicas de métodos para cada constante de um enum
    // Permite "atrelar" métodos para as constantes

// Quando usar? - Quando as constantes necessitam de comportamentos diferentes para o mesmo método

    CREDITO {
        @Override
        public double calcularDesconto(double valor) {
            return valor * 0.03; // 3%
        }
    },
    DEBITO {
        @Override
        public double calcularDesconto(double valor) {
            return valor * 0.08; // 8%
        }
    };

    // Obriga que cada constante do enum forneça sua própia implementação
    public abstract double calcularDesconto(double valor);

}
