package br.unipar.designpatterns.abstractFactory.lightTheme;

import br.unipar.designpatterns.abstractFactory.Button;

public class LightThemeButton implements Button{
    @Override
    public void render(){
        System.out.println("LightTheme Button");
    }
}
