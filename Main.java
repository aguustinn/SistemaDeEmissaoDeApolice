import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {


        Map<String, Object> dadosAuto = new HashMap<>();

        dadosAuto.put("valorFipe", 60000.00);
        dadosAuto.put("idadeCondutor", 23);
        dadosAuto.put("anosHabilitacao", 1);
        dadosAuto.put("coberturaTerceiros", 80000.00);

        try {
            System.out.println(
                    emitirApolice(
                            TipoApolice.AUTO,
                            "João da Silva",
                            dadosAuto
                    )
            );
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }


        Map<String, Object> dadosResidencial = new HashMap<>();

        dadosResidencial.put("valorImovel", 500000.00);
        dadosResidencial.put("altoPadrao", true);
        dadosResidencial.put("possuiEscrituraOuContrato", true);

        try {
            System.out.println(
                    emitirApolice(
                            TipoApolice.RESIDENCIAL,
                            "Maria Oliveira",
                            dadosResidencial
                    )
            );
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }


        Map<String, Object> dadosVida = new HashMap<>();

        dadosVida.put("idade", 35);
        dadosVida.put("capitalSegurado", 600000.00);
        dadosVida.put("fumante", false);
        dadosVida.put("possuiAtestadoMedico", true);

        try {
            System.out.println(
                    emitirApolice(
                            TipoApolice.VIDA,
                            "Carlos Santos",
                            dadosVida
                    )
            );
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        Map<String, Object> dadosViagem = new HashMap<>();

        dadosViagem.put("diasViagem", 10);
        dadosViagem.put("internacional", true);
        dadosViagem.put("coberturaMedica", 50000.00);
        dadosViagem.put("possuiPassaporte", true);

        try {
            System.out.println(
                    emitirApolice(
                            TipoApolice.VIAGEM,
                            "Pedro Souza",
                            dadosViagem
                    )
            );
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }


    private static String emitirApolice(
            TipoApolice tipo,
            String nome,
            Map<String, Object> dados) {

        return "Apólice " + tipo + " emitida para " + nome;
    }
}