package br.unipar.designpatterns_adapter;

public class VividFilter implements Filter{

    @Override
    public void apply(Image image) {
        System.out.println("Aplicando Filtro Vivido!");
    } 
}
