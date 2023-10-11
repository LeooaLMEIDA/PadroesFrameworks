package org.example.vegano;

import org.example.Controller;
import org.example.HamburgerEngine;

public class VeganoController extends Controller {
    @Override
    protected HamburgerEngine createViewEngine(){
        return new VeganoEngine();
    }
}
