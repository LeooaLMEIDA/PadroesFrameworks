package br.unipar.designpatterns_adapter;

import br.unipar.designpatterns_adapter.instaFilters.Caramel;

/** Adapter com herança */
public class CaramelAdapter extends Caramel implements Filter {
    @Override
    public void apply(Image image) {
        init();
        render(image);
    }
}
