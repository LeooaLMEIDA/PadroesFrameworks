package org.example;

public class StatusBar implements Observer{
    private DataSource dataSource;

    public StatusBar(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public void update() {
        System.out.println("StatusBar got notified! " + dataSource.getValue());
    }
}
