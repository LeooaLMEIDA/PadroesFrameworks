package br.unipar.designpatterns.abstractFactory.darkTheme;

import br.unipar.designpatterns.abstractFactory.TextBox;

public class DarkThemeTextBox implements TextBox{

    @Override
    public void render(){
        System.out.println("DarkTheme TextBox");
    }
    
    
}
