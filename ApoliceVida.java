import java.util.ArrayList;
import java.util.List;

class ApoliceVida extends Apolice {

    private final int idade;
    private final double capitalSegurado;
    private final boolean fumante;
    private final boolean possuiAtestadoMedico;

    public ApoliceVida(
            String segurado,
            int idade,
            double capitalSegurado,
            boolean fumante,
            boolean possuiAtestadoMedico) {

        super(segurado);
        this.idade = idade;
        this.capitalSegurado = capitalSegurado;
        this.fumante = fumante;
        this.possuiAtestadoMedico = possuiAtestadoMedico;
    }

    @Override
    public double calcularPremio() {

        double premio = (idade * 12) + (capitalSegurado * 0.002);

        if (fumante) {
            premio *= 1.50;
        }

        return premio;
    }

    @Override
    public boolean validar() {

        if (capitalSegurado > 500000.00) {
            return possuiAtestadoMedico;
        }

        return true;
    }

    @Override
    public List<String> listarDocumentos() {

        List<String> documentos = new ArrayList<>();

        documentos.add("Documento de identidade");
        documentos.add("CPF");

        if (capitalSegurado > 500000.00) {
            documentos.add("Atestado médico");
        }

        return documentos;
    }
}
