import java.time.LocalDate;

public class Transacao {
    LocalDate data;
    String descricao;
    Double valor;
    String tipo;

    @Override
    public String toString() {
        return "Transacao{" +
                "data=" + data +
                ", descricao='" + descricao + '\'' +
                ", valor=" + valor +
                ", tipo='" + tipo + '\'' +
                '}';
    }
}
