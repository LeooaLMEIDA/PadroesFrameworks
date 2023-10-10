package org.example;

import java.util.ArrayList;
import java.util.List;

public class Assunto {

    private List<Observer> Listaobservers = new ArrayList<>();
    public void addObserver (Observer observer) {
        Listaobservers.add(observer);
    }

    public void removeObserver (Observer observer) {
        Listaobservers.remove(observer);
    }

    public void notificaObservadores () {
        for (Observer observer : Listaobservers) {
            observer.update();
        }
    }
}
