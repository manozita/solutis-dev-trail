package exercicio_11;

public class FuncionarioSemEstudo extends Funcionario {

    // construtor
    public FuncionarioSemEstudo(String nome, String codigoFuncional, Comissoes comissao) {
        super(nome, codigoFuncional, comissao);
    }

    // métodos
    @Override
    public String toString() {
        return super.toString();
    }

    public double rendaTotal() {
        return getRendaBasica() + getComissao().getAdicional(); // 0% a mais da renda
    };
}
