import java.util.Arrays;
import java.util.List;

class ApoliceAuto extends Apolice {

    private final double valorFipe;
    private final int idadeCondutor;
    private final int anosHabilitacao;
    private final double coberturaTerceiros;

    public ApoliceAuto(
            String segurado,
            double valorFipe,
            int idadeCondutor,
            int anosHabilitacao,
            double coberturaTerceiros) {

        super(segurado);
        this.valorFipe = valorFipe;
        this.idadeCondutor = idadeCondutor;
        this.anosHabilitacao = anosHabilitacao;
        this.coberturaTerceiros = coberturaTerceiros;
    }

    @Override
    public double calcularPremio() {

        double premioAnual = valorFipe * 0.08;

        if (idadeCondutor < 25) {
            premioAnual *= 1.30;
        }

        if (anosHabilitacao < 2) {
            premioAnual *= 1.20;
        }

        return premioAnual / 12;
    }

    @Override
    public boolean validar() {
        return coberturaTerceiros >= 50000.00;
    }

    @Override
    public List<String> listarDocumentos() {
        return Arrays.asList(
                "CNH",
                "CRLV",
                "Comprovante de residência"
        );
    }
}
