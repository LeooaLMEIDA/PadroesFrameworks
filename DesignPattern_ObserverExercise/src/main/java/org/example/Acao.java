package org.example;

public class Acao extends Assunto {
    private double valor;

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
        notificaObservadores();
    }
}
