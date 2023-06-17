package com.cadastro;

public class Cadastro {
    private Pessoa pessoa;
    private Endereco endereco;
    private Contato contato;
    private DadosProfissionais dadosProfissionais;
    private Habilidades habilidades;
    private Salario salario;

    public void setPessoa(Pessoa pessoa){
        this.pessoa = pessoa;
    }
    public Pessoa getPessoa(){
        return this.pessoa;
    }

    public void setEndereco(Endereco endereco){
        this.endereco = endereco;
    }
    public Endereco getEndereco(){
        return this.endereco;
    }

    public void setContato(Contato contato){
        this.contato = contato;
    }
    public Contato getContato(){
        return this.contato;
    }

    public void setDadosProfissionais(DadosProfissionais dadosProfissionais){
        this.dadosProfissionais = dadosProfissionais;
    }
    public DadosProfissionais getDadosProfissionais(){
        return this.dadosProfissionais;
    }

    public void setHabilidades(Habilidades habilidades){
        this.habilidades = habilidades;
    }
    public Habilidades getHabilidades(){
        return this.habilidades;
    }

    public void setSalario(Salario salario){
        this.salario = salario;
    }
    public Salario getSalario(){
        return this.salario;
    }
}
