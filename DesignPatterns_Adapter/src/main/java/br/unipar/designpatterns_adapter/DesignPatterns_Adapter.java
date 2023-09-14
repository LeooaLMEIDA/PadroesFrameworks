package br.unipar.designpatterns_adapter;

import br.unipar.designpatterns_adapter.instaFilters.Caramel;

public class DesignPatterns_Adapter {

    public static void main(String[] args) {
        ImageView imageView = new ImageView(new Image());
        imageView.apply(new CaramelFilter(new Caramel()));
    }
}
