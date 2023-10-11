package org.example;

import org.example.Angus.AngusEngine;

import java.util.Map;

public class Controller {
    public void render(String viewName, Map<String, Object> context){
        HamburgerEngine engine = createViewEngine();
        String html = engine.render(viewName, context);
        System.out.println(html);
    }

    protected HamburgerEngine createViewEngine(){
        return new AngusEngine();
    }
}

