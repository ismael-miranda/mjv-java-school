package com.cadastro;

public class DadosProfissionais {
    private String profissao;
    private String empresa;
    private Double salario;
    private boolean empregoAtual;

    public void setProfissao(String profissao){
        this.profissao = profissao;
    }
    public String getProfissao(){
        return this.profissao;
    }

    public void setEmpresa(String empresa){
        this.empresa = empresa;
    }
    public String getEmpresa(){
        return this.empresa;
    }

    public void setSalario(Double salario){
        this.salario = salario;
    }
    public Double getSalario(){
        return this.salario;
    }

    public void setEmpregoAtual(boolean empregoAtual){
        this.empregoAtual = empregoAtual;
    }
    public boolean getEmpregoAtual(){
        return this.empregoAtual;
    }
}
