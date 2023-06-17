package com.cadastro;

import java.time.LocalDate;

public class Pessoa {
    private String nome;
    private String cpf;
    private LocalDate dataNasc;
    private Sexo sexo;

    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    public String getCpf(){
        return this.cpf;
    }

    public void setDataNasc(LocalDate dataNasc){
        this.dataNasc = dataNasc;
    }
    public LocalDate getDataNasc(){
        return this.dataNasc;
    }

    public void setSexo(Sexo sexo){
        this.sexo = sexo;
    }
    public Sexo getSexo(){
        return this.sexo;
    }

}
