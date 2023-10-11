package org.example.vegano;

import org.example.HamburgerEngine;

import java.util.Map;

public class VeganoEngine implements HamburgerEngine {

    @Override
    public String render(String viewName, Map<String, Object> context) {
        return "Hamburguer Vegano";
    }
}
