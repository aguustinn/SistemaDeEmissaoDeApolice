import java.util.Arrays;
import java.util.List;

class ApoliceResidencial extends Apolice {

    private final double valorImovel;
    private final boolean altoPadrao;
    private final boolean possuiEscrituraOuContrato;

    public ApoliceResidencial(
            String segurado,
            double valorImovel,
            boolean altoPadrao,
            boolean possuiEscrituraOuContrato) {

        super(segurado);
        this.valorImovel = valorImovel;
        this.altoPadrao = altoPadrao;
        this.possuiEscrituraOuContrato = possuiEscrituraOuContrato;
    }

    @Override
    public double calcularPremio() {

        double premioAnual = valorImovel * 0.015;

        if (altoPadrao) {
            premioAnual *= 1.25;
        }

        return premioAnual / 12;
    }

    @Override
    public boolean validar() {
        return possuiEscrituraOuContrato;
    }

    @Override
    public List<String> listarDocumentos() {
        return Arrays.asList(
                "Escritura ou contrato de locação",
                "Comprovante de residência"
        );
    }
}