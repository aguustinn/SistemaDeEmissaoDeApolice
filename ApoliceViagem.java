import java.util.ArrayList;
import java.util.List;

class ApoliceViagem extends Apolice {

    private final int diasViagem;
    private final boolean internacional;
    private final double coberturaMedica;
    private final boolean possuiPassaporte;

    public ApoliceViagem(
            String segurado,
            int diasViagem,
            boolean internacional,
            double coberturaMedica,
            boolean possuiPassaporte) {

        super(segurado);
        this.diasViagem = diasViagem;
        this.internacional = internacional;
        this.coberturaMedica = coberturaMedica;
        this.possuiPassaporte = possuiPassaporte;
    }

    @Override
    public double calcularPremio() {

        double premio = diasViagem * 15.00;

        if (internacional) {
            premio += 100.00;
        }

        return premio;
    }

    @Override
    public boolean validar() {

        if (internacional) {
            return coberturaMedica >= 30000.00
                    && possuiPassaporte;
        }

        return true;
    }

    @Override
    public List<String> listarDocumentos() {

        List<String> documentos = new ArrayList<>();

        documentos.add("Itinerário de viagem");

        if (internacional) {
            documentos.add("Passaporte");
        }

        return documentos;
    }
}
