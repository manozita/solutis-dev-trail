package exercicio_01;

public abstract class Animal {
    // variáveis
    protected String nome;
    protected int idade;

    // construtor
    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // métodos
    public abstract void emitirSom();
}
