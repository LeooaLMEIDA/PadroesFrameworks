package org.example;

import org.example.Sharp.SharpController;
import org.example.matcha.Controller;
import org.example.matcha.MatchaViewEngine;

import java.util.HashMap;
import java.util.Map;

public class ProductController extends SharpController {
    public void listProducts(){
        //Aqui pega os dados do banco;
        Map<String, Object> context = new HashMap<>();
        //context é populado...;
        render("productsView.html", context);
    }
}
