package org.example;

import org.example.construirPeso.ConstruirMusculoFactory;
import org.example.perderPeso.PerderPesoFactory;

public class Main {
    public static void main(String[] args) {
        new ConstruirMusculo().render(new ConstruirMusculoFactory());
        new PerderPeso().render(new PerderPesoFactory());
    }
}