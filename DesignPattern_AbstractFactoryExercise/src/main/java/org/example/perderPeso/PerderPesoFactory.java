package org.example.perderPeso;

import org.example.Factory;
import org.example.TreinoA;
import org.example.TreinoB;

public class PerderPesoFactory implements Factory {

    @Override
    public TreinoA createTreinoA() {
        return new PerderPesoTreinoA();
    }

    @Override
    public TreinoB createTreinoB() {
        return new PerderPesoTreinoB();
    }
}
