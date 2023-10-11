package org.example.Angus;

import org.example.HamburgerEngine;

import java.util.Map;

public class AngusEngine implements HamburgerEngine {
    @Override
    public String render(String viewName, Map<String, Object> context) {
        return "Hamburguer Angus";
    }

}
