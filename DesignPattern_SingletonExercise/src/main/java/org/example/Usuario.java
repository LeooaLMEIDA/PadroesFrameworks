package org.example;

public class Usuario {
    private String nomeUsuar;
    private String loginUsuar;
    private String senha;

    public Usuario() {
    }

    public Usuario(String nomeUsuar, String loginUsuar, String senha) {
        this.nomeUsuar = nomeUsuar;
        this.loginUsuar = loginUsuar;
        this.senha = senha;
    }

    public String getNomeUsuar() {
        return nomeUsuar;
    }

    public void setNomeUsuar(String nomeUsuar) {
        this.nomeUsuar = nomeUsuar;
    }

    public String getLoginUsuar() {
        return loginUsuar;
    }

    public void setLoginUsuar(String loginUsuar) {
        this.loginUsuar = loginUsuar;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nomeUsuar='" + nomeUsuar + '\'' +
                ", loginUsuar='" + loginUsuar + '\'' +
                ", senha='" + senha + '\'' +
                '}';
    }
}
