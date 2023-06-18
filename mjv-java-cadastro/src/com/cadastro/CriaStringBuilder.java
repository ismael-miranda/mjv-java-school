package com.cadastro;

public class CriaStringBuilder {
    public String criaCabecalho(){
        StringBuilder cabecalho = new StringBuilder();
        cabecalho.append("Nome");
        cabecalho.append(";");
        cabecalho.append("CPF");
        cabecalho.append(";");
        cabecalho.append("Data Nasc");
        cabecalho.append(";");
        cabecalho.append("Sexo");
        cabecalho.append(";");

        cabecalho.append("Email");
        cabecalho.append(";");
        cabecalho.append("Telefone");
        cabecalho.append(";");
        cabecalho.append("Celular");
        cabecalho.append(";");
        cabecalho.append("Celular Whats");
        cabecalho.append(";");

        cabecalho.append("Logradouro");
        cabecalho.append(";");
        cabecalho.append("Número");
        cabecalho.append(";");
        cabecalho.append("Complemento");
        cabecalho.append(";");
        cabecalho.append("Bairro");
        cabecalho.append(";");
        cabecalho.append("Cidade");
        cabecalho.append(";");
        cabecalho.append("Estado");
        cabecalho.append(";");

        cabecalho.append("Profissão");
        cabecalho.append(";");
        cabecalho.append("Empresa");
        cabecalho.append(";");
        cabecalho.append("Salário");
        cabecalho.append(";");
        cabecalho.append("Emprego Atual");
        cabecalho.append(";");

        cabecalho.append("Habilidades");
        cabecalho.append(";");

        cabecalho.append("Sal MAX");
        cabecalho.append(";");
        cabecalho.append("Sal MIN");
        cabecalho.append("\n");

        return String.valueOf(cabecalho);

    }
    public String criarString(Cadastro cadastro){
        StringBuilder camposString = new StringBuilder();

        camposString.append(cadastro.getPessoa().getNome());
        camposString.append(";");
        camposString.append(cadastro.getPessoa().getCpf());
        camposString.append(";");
        camposString.append(cadastro.getPessoa().getDataNasc());
        camposString.append(";");
        camposString.append(cadastro.getPessoa().getSexo());
        camposString.append(";");

        camposString.append(cadastro.getContato().getEmail());
        camposString.append(";");
        camposString.append(cadastro.getContato().getTelefone());
        camposString.append(";");
        camposString.append(cadastro.getContato().getCelular());
        camposString.append(";");
        camposString.append(cadastro.getContato().getCelularWhatsApp());
        camposString.append(";");

        camposString.append(cadastro.getEndereco().getLogradouro());
        camposString.append(";");
        camposString.append(cadastro.getEndereco().getNumero());
        camposString.append(";");
        camposString.append(cadastro.getEndereco().getComplemento());
        camposString.append(";");
        camposString.append(cadastro.getEndereco().getBairro());
        camposString.append(";");
        camposString.append(cadastro.getEndereco().getCidade());
        camposString.append(";");
        camposString.append(cadastro.getEndereco().getEstado());
        camposString.append(";");

        camposString.append(cadastro.getDadosProfissionais().getProfissao());
        camposString.append(";");
        camposString.append(cadastro.getDadosProfissionais().getEmpresa());
        camposString.append(";");
        camposString.append(cadastro.getDadosProfissionais().getSalario());
        camposString.append(";");
        camposString.append(cadastro.getDadosProfissionais().getEmpregoAtual());
        camposString.append(";");

        camposString.append(cadastro.getHabilidades().getHabilidades());
        camposString.append(";");

        camposString.append(cadastro.getSalario().getPretensaoMaxima());
        camposString.append(";");
        camposString.append(cadastro.getSalario().getPretensaoMinima());
        camposString.append("\n");

        return String.valueOf(camposString);
    }

}
