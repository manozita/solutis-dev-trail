package exercicio_06;

public abstract class Funcionario {

    // variáveis
    private final String nome, codigoFuncional;
    private final double rendaBasica = 1000;

    // construtor
    public Funcionario(String nome, String codigoFuncional) {
        this.nome = nome;
        this.codigoFuncional = codigoFuncional;
    }

    // métodos
    public double getRendaBasica() {
        return rendaBasica;
    }
    public String toString() {
        return "\tNome: " + nome + "\n\tCódigo funcional: " + codigoFuncional;
    }

    public abstract double rendaTotal();
}
