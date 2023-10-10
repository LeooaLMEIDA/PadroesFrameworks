package org.example;

public class StatusBar implements Observer {
    private Acao acao;

    public StatusBar(Acao acao) {
        this.acao = acao;
    }

    @Override
    public void update() {
        System.out.println("A StatusBar foi notificada. Novo valor: " + acao.getValor());
    }
}
