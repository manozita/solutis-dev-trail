package exercicio_05;

public class FuncionarioEnsinoMedio extends Funcionario {
    // variáveis
    private final String escolaB, escolaM;

    public FuncionarioEnsinoMedio(String nome, String codigoFuncional, String escolaB, String escolaM) {
        super(nome, codigoFuncional);
        this.escolaB = escolaB;
        this.escolaM = escolaM;
    }

    @Override
    public String toString() {
        return super.toString() + "\n\tEscola ensino básico: " + escolaB + "\n\tEscola ensino médio: " + escolaM;
    }
}
