package com.cadastro;

public class Contato {
    private String email;
    private Long telefone;
    private Long celular;
    private boolean celularWhatsApp;

    public void setEmail(String email){
        this.email = email;
    }
    public String getEmail(){
        return this.email;
    }

    public void setTelefone(Long telefone){
        this.telefone = telefone;
    }
    public Long getTelefone(){
        return this.telefone;
    }

    public void setCelular(Long celular){
        this.celular = celular;
    }
    public Long getCelular(){
        return this.celular;
    }

    public void setCelularWhatsApp(boolean celularWhatsApp){
        this.celularWhatsApp = celularWhatsApp;
    }
    public boolean getCelularWhatsApp(){
        return this.celularWhatsApp;
    }
}
