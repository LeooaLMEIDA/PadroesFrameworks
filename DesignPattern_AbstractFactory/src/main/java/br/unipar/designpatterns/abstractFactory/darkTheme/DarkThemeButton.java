package br.unipar.designpatterns.abstractFactory.darkTheme;

import br.unipar.designpatterns.abstractFactory.Button;

public class DarkThemeButton implements Button{
    @Override
    public void render() {
        System.out.println("DarkTheme Button!");
    }
    
}
