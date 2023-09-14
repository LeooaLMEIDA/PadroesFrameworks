package org.example;

public class Main {
    public static void main(String[] args) {
        DataSource dataSource = new DataSource();
        StockListView lista1 = new StockListView(dataSource);
        StatusBar statusBar = new StatusBar(dataSource);

        dataSource.addObserver(lista1);
        dataSource.addObserver(statusBar);

        dataSource.setValue("BBSA3");
    }
}