package exercicio_05;

public class FuncionarioEnsinoBasico extends Funcionario {
    // variáveis
    private final String escolaB;

    public FuncionarioEnsinoBasico(String nome, String codigoFuncional, String escolaB) {
        super(nome, codigoFuncional);
        this.escolaB = escolaB;
    }

    @Override
    public String toString() {
        return super.toString() + "\n\tEscola ensino básico: " + escolaB;
    }
}
