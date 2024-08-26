package exercicio_09;
import exercicio_08.Comissoes;

public class FuncionarioEnsinoBasico extends Funcionario {
    // variáveis
    private final String escolaB;

    public FuncionarioEnsinoBasico(String nome, String codigoFuncional, String escolaB, Comissoes comissao) {
        super(nome, codigoFuncional, comissao);
        this.escolaB = escolaB;
    }

    // métodos
    @Override
    public String toString() {
        return super.toString() + "\n\tEscola ensino básico: " + escolaB;
    }

    public double rendaTotal() {
        return (super.getRendaBasica() - this.getComissao().getAdicional())*1.1 + this.getComissao().getAdicional(); // 10% a mais de renda
    };
}
