package br.unipar.designpatterns.abstractFactory.app;

import br.unipar.designpatterns.abstractFactory.WidgetFactory;

public class ContactForm {

    public void render(WidgetFactory factory){
        factory.createButton().render();
        factory.createTextBox().render();
    }
}
