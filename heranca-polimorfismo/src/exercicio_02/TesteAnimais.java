package exercicio_02;
import exercicio_01.*;

public class TesteAnimais {
    public static void main(String[] args) {

        // animais
        Cachorro cachorro = new Cachorro("Poodle", 11);
        Cavalo cavalo = new Cavalo("Cavalo andaluz", 20);
        Preguica preguica = new Preguica("Preguica real", 25);

        // metodo emitirSom para cada animal
        emitirSom(cachorro);
        emitirSom(cavalo);
        emitirSom(preguica);

    }
    public static void emitirSom(Animal animal) {
        animal.emitirSom();
    }
}
