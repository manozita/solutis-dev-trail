package exercicio_09;
import exercicio_08.Comissoes;

public class FuncionarioEnsinoMedio extends Funcionario {
    // variáveis
    private final String escolaB, escolaM;

    public FuncionarioEnsinoMedio(String nome, String codigoFuncional, String escolaB, String escolaM, Comissoes comissao) {
        super(nome, codigoFuncional, comissao);
        this.escolaB = escolaB;
        this.escolaM = escolaM;
    }

    @Override
    public String toString() {
        return super.toString() + "\n\tEscola ensino básico: " + escolaB + "\n\tEscola ensino médio: " + escolaM;
    }

    public double rendaTotal() {
        return (super.getRendaBasica() - this.getComissao().getAdicional())*1.5 + this.getComissao().getAdicional(); // 50% a mais de renda
    };
}
