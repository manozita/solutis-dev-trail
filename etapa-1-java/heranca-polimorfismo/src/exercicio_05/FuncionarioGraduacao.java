package exercicio_05;

public class FuncionarioGraduacao extends Funcionario {
    // variáveis
    private final String escolaB, escolaM, universidade;

    public FuncionarioGraduacao(String nome, String codigoFuncional, String escolaB, String escolaM, String universidade) {
        super(nome, codigoFuncional);
        this.escolaB = escolaB;
        this.escolaM = escolaM;
        this.universidade = universidade;
    }

    @Override
    public String toString() {
        return super.toString() + "\n\tEscola ensino básico: " + escolaB + "\n\tEscola ensino médio: " + escolaM + "\n\tUniversidade: " + universidade;
    }
}
