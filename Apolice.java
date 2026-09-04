import java.time.LocalDate;
import java.util.*;


abstract class Apolice {

    private String numero;
    private final String segurado;
    private final LocalDate dataEmissao;

    public Apolice(String segurado) {
        this.segurado = segurado;
        this.dataEmissao = LocalDate.now();
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getSegurado() {
        return segurado;
    }

    public LocalDate getDataEmissao() {
        return dataEmissao;
    }

    public abstract double calcularPremio();

    public abstract boolean validar();

    public abstract List<String> listarDocumentos();

    public String gerarResumo() {
        return "\n===== RESUMO DA APÓLICE =====\n" +
                "Número: " + numero + "\n" +
                "Segurado: " + segurado + "\n" +
                "Data de emissão: " + dataEmissao + "\n" +
                "Prêmio: R$ " + String.format(Locale.US, "%.2f", calcularPremio()) + "\n" +
                "Documentos exigidos: " + String.join(", ", listarDocumentos()) +
                "\n==============================";
    }
}
