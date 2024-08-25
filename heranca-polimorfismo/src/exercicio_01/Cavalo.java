package exercicio_01;

public class Cavalo extends Animal {

    // construtor
    public Cavalo(String nome, int idade) {
        super(nome, idade);
    }

    // métodos
    @Override
    public void emitirSom() {
        System.out.println("O cavalo " + nome + " relinchou.\n");
    }
    public void correr() {
        System.out.println("O cavalo correu.\n");
    }
}
