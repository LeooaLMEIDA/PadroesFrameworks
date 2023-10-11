package org.example.construirPeso;

import org.example.Factory;
import org.example.TreinoA;
import org.example.TreinoB;

public class ConstruirMusculoFactory implements Factory {

    @Override
    public TreinoA createTreinoA() {
        return new ConstruirMusculoTreinoA();
    }

    @Override
    public TreinoB createTreinoB() {
        return new ConstruirMusculoTreinoB();
    }
}
