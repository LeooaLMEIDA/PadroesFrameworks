
package br.unipar.designpatterns.abstractFactory.lightTheme;

import br.unipar.designpatterns.abstractFactory.Button;
import br.unipar.designpatterns.abstractFactory.TextBox;
import br.unipar.designpatterns.abstractFactory.WidgetFactory;

public class LightThemeFactory implements WidgetFactory{

    @Override
    public Button createButton() {
        return new LightThemeButton();
    }

    @Override
    public TextBox createTextBox() {
        return new LightThemeTextBox();
    }
    
}
