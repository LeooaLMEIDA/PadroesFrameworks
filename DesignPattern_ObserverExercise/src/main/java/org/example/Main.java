package org.example;

public class Main {
    public static void main(String[] args) {
        //o que será observado
        Acao acao = new Acao();

        StatusBar statusBar = new StatusBar(acao);
        StockListView stockListView = new StockListView(acao);

        acao.addObserver(statusBar);
        acao.addObserver(stockListView);

        acao.setValor(25);
    }
}