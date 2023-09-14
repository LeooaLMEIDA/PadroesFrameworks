package org.example;

public class Main {
    public static void main(String[] args) {

        Usuario usuario = new Usuario();
        usuario.setLoginUsuar("leo");
        usuario.setNomeUsuar("Leonardo Almeida");
        usuario.setSenha("123");

        ConfigManager manager = ConfigManager.getInstance();
        manager.set("leo", usuario);

        ConfigManager otherManager = ConfigManager.getInstance();
        System.out.println(otherManager.get("leo"));
    }
}