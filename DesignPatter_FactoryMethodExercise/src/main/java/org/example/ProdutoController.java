package org.example;

import org.example.vegano.VeganoController;

import java.util.HashMap;
import java.util.Map;

public class ProdutoController extends VeganoController{
    public void listProduct(){
        Map<String, Object> context = new HashMap<>();
        render("productsView.html", context);
    }
}
