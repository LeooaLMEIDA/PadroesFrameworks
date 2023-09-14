package br.unipar.designpatterns_adapter;

import br.unipar.designpatterns_adapter.instaFilters.Caramel;

/** Adapter com Composição*/
public class CaramelFilter implements Filter{
    private Caramel caramel;

    public CaramelFilter(Caramel caramel){
        this.caramel = caramel;
    }
    @Override
    public void apply(Image image) {
        caramel.init();
        caramel.render(image);
    }
}
