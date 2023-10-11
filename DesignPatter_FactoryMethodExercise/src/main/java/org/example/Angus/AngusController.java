package org.example.Angus;

import org.example.HamburgerEngine;

import java.util.Map;

public class AngusController {

    public void render(String viewName, Map<String, Object> context){
        HamburgerEngine engine = createViewEngine();
        String html = engine.render(viewName, context);
        System.out.println(html);
    }

    protected HamburgerEngine createViewEngine(){
        return new AngusEngine();
    }

}
