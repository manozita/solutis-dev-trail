package exercicio_05;

public abstract class Funcionario {

    // variáveis
    private final String nome, codigoFuncional;

    // construtor
    public Funcionario(String nome, String codigoFuncional) {
        this.nome = nome;
        this.codigoFuncional = codigoFuncional;
    }

    // métodos
    public String toString() {
        return "\tNome: " + nome + "\n\tCódigo funcional: " + codigoFuncional;
    }
}
