package br.unipar.designpatterns.abstractFactory.darkTheme;

import br.unipar.designpatterns.abstractFactory.Button;
import br.unipar.designpatterns.abstractFactory.TextBox;
import br.unipar.designpatterns.abstractFactory.WidgetFactory;

public class DarkThemeFactory implements WidgetFactory{

    @Override
    public Button createButton() {
        return new DarkThemeButton();
    }

    @Override
    public TextBox createTextBox() {
        return new DarkThemeTextBox();
    }

}
