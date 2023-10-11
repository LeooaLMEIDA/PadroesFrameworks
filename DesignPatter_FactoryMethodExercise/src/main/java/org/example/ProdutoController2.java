package org.example;

import java.util.HashMap;
import java.util.Map;

public class ProdutoController2 extends Controller{
    public void listProduct(){
        Map<String, Object> context = new HashMap<>();
        render("productsView.html", context);
    }
}
