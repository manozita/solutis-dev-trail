package exercicio_11;

public class FuncionarioGraduacao extends Funcionario {
    // variáveis
    private final String escolaB, escolaM, universidade;

    public FuncionarioGraduacao(String nome, String codigoFuncional, String escolaB, String escolaM, String universidade, Comissoes comissao) {
        super(nome, codigoFuncional, comissao);
        this.escolaB = escolaB;
        this.escolaM = escolaM;
        this.universidade = universidade;
    }

    @Override
    public String toString() {
        return super.toString() + "\n\tEscola ensino básico: " + escolaB + "\n\tEscola ensino médio: " + escolaM + "\n\tUniversidade: " + universidade;
    }

    public double rendaTotal() {
        return (super.getRendaBasica() - this.getComissao().getAdicional())*2 + this.getComissao().getAdicional(); // 100% a mais da renda
    };
}
