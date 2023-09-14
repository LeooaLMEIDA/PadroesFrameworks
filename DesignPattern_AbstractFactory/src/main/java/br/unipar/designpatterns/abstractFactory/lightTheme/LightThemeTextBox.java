package br.unipar.designpatterns.abstractFactory.lightTheme;

import br.unipar.designpatterns.abstractFactory.TextBox;

public class LightThemeTextBox implements TextBox{

    @Override
    public void render(){
        System.out.println("LightTheme TextBox");
    }
}
