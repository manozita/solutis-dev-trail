package exercicio_06;

public class FuncionarioSemEstudo extends Funcionario {

    // construtor
    public FuncionarioSemEstudo(String nome, String codigoFuncional) {
        super(nome, codigoFuncional);
    }

    // métodos
    @Override
    public String toString() {
        return super.toString();
    }

    public double rendaTotal() {
        return super.getRendaBasica(); // 0% a mais da renda
    };
}
