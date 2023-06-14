import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;
public class ContaCorrente {
    Cliente cliente;

    Double saldo = 132.0;
    Integer numeroConta;
    Integer numeroAgencia;
    boolean ativa = true;

    List<Transacao> transacoes = new ArrayList<>();

    boolean sacar(Double valor){
        if(this.saldo < valor){
            return false;
        }
        this.saldo = this.saldo - valor;
        incluirTransacao(valor);
        return true;
    }
    private void incluirTransacao(Double valor){
        Transacao t = new Transacao();
        t.data = LocalDate.now();
        t.tipo = "SAQUE";
        t.descricao = "Saque em especie";
        t.valor = valor;
        transacoes.add(t);
    }

    void transferir(ContaCorrente contaDestino, Double valor){}

    Double consultarSaldo(){
        return this.saldo;
    }

    List<Transacao> consultaExtrato(LocalDate di, LocalDate df){
        return transacoes;
    }

    void cancelarConta(String justificativa){
        this.ativa = false;
    }
}
