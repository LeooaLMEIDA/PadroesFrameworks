package org.example.Sharp;

import org.example.matcha.Controller;
import org.example.matcha.ViewEngine;

public class SharpController extends Controller {
    @Override
    protected ViewEngine createViewEngine(){
        return new SharpViewEngine();
    }
}
