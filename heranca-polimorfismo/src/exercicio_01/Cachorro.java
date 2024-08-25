package exercicio_01;

public class Cachorro extends Animal {

    // construtor
    public Cachorro(String nome, int idade) {
        super(nome, idade);
    }

    // métodos
    @Override
    public void emitirSom() {
        System.out.println("O cachorro " + nome + " latiu.\n");
    }
    public void correr() {
        System.out.println("O cachorro correu.\n");
    }
}
