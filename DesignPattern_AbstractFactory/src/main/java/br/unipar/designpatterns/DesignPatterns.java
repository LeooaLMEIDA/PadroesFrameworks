
package br.unipar.designpatterns;

import br.unipar.designpatterns.abstractFactory.app.ContactForm;
import br.unipar.designpatterns.abstractFactory.lightTheme.LightThemeFactory;

public class DesignPatterns {

    public static void main(String[] args) {
        new ContactForm().render(new LightThemeFactory());
    }
}
