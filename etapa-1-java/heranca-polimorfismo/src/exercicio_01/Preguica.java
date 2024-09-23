package exercicio_01;

public class Preguica extends Animal {

    // construtor
    public Preguica(String nome, int idade) {
        super(nome, idade);
    }

    // métodos
    @Override
    public void emitirSom() {
        System.out.println("A preguiça " + nome + " grunhiu.\n");
    }
    public void subirArvore() {
        System.out.println("A preguiça subiu nas árvores.\n");
    }
}
