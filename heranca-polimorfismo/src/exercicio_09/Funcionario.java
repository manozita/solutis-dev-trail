package exercicio_09;
import exercicio_08.Comissoes;

public abstract class Funcionario {

    // variáveis
    private final String nome, codigoFuncional;
    private Comissoes comissao;
    private final double rendaBasica = 1000;

    // construtor
    public Funcionario(String nome, String codigoFuncional, Comissoes comissao) {
        this.nome = nome;
        this.codigoFuncional = codigoFuncional;
        this.comissao = comissao;
    }

    // métodos
    public double getRendaBasica() {
        return rendaBasica;
    }
    public Comissoes getComissao() { return comissao; }
    public String toString() {
        return "\tNome: " + nome + "\n\tCódigo funcional: " + codigoFuncional;
    }

    public abstract double rendaTotal();
}
