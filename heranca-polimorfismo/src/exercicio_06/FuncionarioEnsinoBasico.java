package exercicio_06;

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

    public double rendaTotal() {
        return super.getRendaBasica()*1.1; // 10% a mais da renda
    };
}
