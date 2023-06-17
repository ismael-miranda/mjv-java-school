package com.cadastro;

public enum Sexo {
    MASCULINO ("M", "MASCULINO"),
    FEMININO ("F","FEMININO");

    private String genero;
    private String sigla;
    private Sexo(String sigla, String genero){
        this.sigla = sigla;
        this.genero = genero;
    }
    public String getGenero(){
        return this.genero;
    }
    public String getSigla(){
        return this.sigla;
    }
    public String getGeneroMaiusculo(){
        return this.genero.toUpperCase();
    }

}
