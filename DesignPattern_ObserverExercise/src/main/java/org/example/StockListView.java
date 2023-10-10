package org.example;

public class StockListView implements Observer {
    private Acao acao;

    public StockListView(Acao acao) {
        this.acao = acao;
    }

    @Override
    public void update() {
        System.out.println("A StockListView foi notificada. Novo valor: " + acao.getValor());
    }
}
