package com.cadastro;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class FormCadastro {
    public static void main(String[] args) {
        Pessoa pessoa01 = new Pessoa();
        pessoa01.setNome("Normandia Norues");
        pessoa01.setCpf("098.890.123-00");
        pessoa01.setDataNasc(LocalDate.of(1990, 01, 20));
        pessoa01.setSexo(Sexo.FEMININO);

        Contato contato01 = new Contato();
        contato01.setEmail("normandia@norues.com");
        contato01.setTelefone(1155554000L);
        contato01.setCelular(11900001000L);
        contato01.setCelularWhatsApp(true);

        Endereco endereco01 = new Endereco();
        endereco01.setLogradouro("Rua: Noruega");
        endereco01.setNUmero("231A");
        endereco01.setComplemento("Sala 11, 1º andar");
        endereco01.setBairro("Jardineiro");
        endereco01.setCidade("São Paulo");
        endereco01.setEstado("SP");

        DadosProfissionais dadosProf01 = new DadosProfissionais();
        dadosProf01.setProfissao("Pesacador");
        dadosProf01.setEmpresa("Pesca em Alto Mar");
        dadosProf01.setSalario(2500.00);
        dadosProf01.setEmpregoAtual(false);

        Habilidades habilidades01 = new Habilidades();
        List<String> habil = new ArrayList();
        habil.add("Pescar em Alto Mar");
        habil.add("Liderar tripulação");
        habil.add("Operação de Máquinas");
        habilidades01.setHabilidades(String.valueOf(habil));

        Salario salario01 = new Salario();
        salario01.setPretensaoMaxima(4000.00);
        salario01.setPretensaoMinima(2500.00);

        Cadastro cadastro = new Cadastro();
        cadastro.setPessoa(pessoa01);
        cadastro.setContato(contato01);
        cadastro.setEndereco(endereco01);
        cadastro.setHabilidades(habilidades01);
        cadastro.setSalario(salario01);

        System.out.println(cadastro.getPessoa());
        System.out.println(cadastro.getContato());
        System.out.println(cadastro.getEndereco());
        System.out.println(cadastro.getHabilidades());
        System.out.println(cadastro.getSalario());

    }
}
