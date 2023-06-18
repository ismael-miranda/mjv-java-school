package com.cadastro;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class FormCadastro {
    public static void main(String[] args) throws FileNotFoundException {
        Pessoa pessoa01 = new Pessoa();
        pessoa01.setNome("Normandia Norues");
        pessoa01.setCpf("098.890.123-00");
        pessoa01.setDataNasc(LocalDate.of(1990, 01, 20));
        pessoa01.setSexo(Sexo.FEMININO);

        Pessoa pessoa02 = new Pessoa();
        pessoa02.setNome("Javanildo dos EUA");
        pessoa02.setCpf("998.899.123-99");
        pessoa02.setDataNasc(LocalDate.of(1980, 05, 17));
        pessoa02.setSexo(Sexo.MASCULINO);

        Contato contato01 = new Contato();
        contato01.setEmail("normandia@norues.com");
        contato01.setTelefone(1155554000L);
        contato01.setCelular(11900001000L);
        contato01.setCelularWhatsApp(true);

        Contato contato02 = new Contato();
        contato02.setEmail("javanildo@java.com");
        contato02.setTelefone(1159991234L);
        contato02.setCelular(11901010001L);
        contato02.setCelularWhatsApp(true);

        Endereco endereco01 = new Endereco();
        endereco01.setLogradouro("Rua: Noruega");
        endereco01.setNUmero("231A");
        endereco01.setComplemento("Sala 11, 1º andar");
        endereco01.setBairro("Jardineiro");
        endereco01.setCidade("São Paulo");
        endereco01.setEstado("SP");

        Endereco endereco02 = new Endereco();
        endereco02.setLogradouro("Rua: Antiga Oak");
        endereco02.setNUmero("10");
        endereco02.setComplemento("");
        endereco02.setBairro("Santo Java");
        endereco02.setCidade("Javalandia");
        endereco02.setEstado("JV");

        DadosProfissionais dadosProf01 = new DadosProfissionais();
        dadosProf01.setProfissao("Pesacador");
        dadosProf01.setEmpresa("Pesca em Alto Mar");
        dadosProf01.setSalario(2500.00);
        dadosProf01.setEmpregoAtual(false);

        DadosProfissionais dadosProf02 = new DadosProfissionais();
        dadosProf02.setProfissao("Desenvolvedor");
        dadosProf02.setEmpresa("Sun noSystem");
        dadosProf02.setSalario(3500.00);
        dadosProf02.setEmpregoAtual(false);

        Habilidades habilidades01 = new Habilidades();
        List<String> habil = new ArrayList();
        habil.add("Pescar em Alto Mar");
        habil.add("Liderar tripulação");
        habil.add("Operação de Máquinas");
        habilidades01.setHabilidades(String.valueOf(habil));

        Habilidades habilidades02 = new Habilidades();
        List<String> habil02 = new ArrayList();
        habil02.add("Sempre Calmo");
        habil02.add("Gosto de Café");
        habil02.add("Paciencia com o User");
        habilidades02.setHabilidades(String.valueOf(habil02));

        Salario salario01 = new Salario();
        salario01.setPretensaoMaxima(4000.00);
        salario01.setPretensaoMinima(2500.00);

        Salario salario02 = new Salario();
        salario02.setPretensaoMaxima(8000.00);
        salario02.setPretensaoMinima(3500.00);

        Cadastro cadastro01 = new Cadastro();
        cadastro01.setPessoa(pessoa01);
        cadastro01.setContato(contato01);
        cadastro01.setEndereco(endereco01);
        cadastro01.setDadosProfissionais(dadosProf01);
        cadastro01.setHabilidades(habilidades01);
        cadastro01.setSalario(salario01);

        Cadastro cadastro02 = new Cadastro();
        cadastro02.setPessoa(pessoa02);
        cadastro02.setContato(contato02);
        cadastro02.setEndereco(endereco02);
        cadastro02.setDadosProfissionais(dadosProf02);
        cadastro02.setHabilidades(habilidades02);
        cadastro02.setSalario(salario02);


        CriaStringBuilder criar = new CriaStringBuilder();

        String caminhoPasta = "C:\\mjv\\java\\mjv-java-school\\mjv-java-cadastro\\";
        PrintWriter arquivo = new PrintWriter(new File(caminhoPasta + "file.csv"));
        arquivo.write(criar.criaCabecalho());
        arquivo.write(criar.criarString(cadastro01));
        arquivo.write(criar.criarString(cadastro02));
        arquivo.close();

    }
}
