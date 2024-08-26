package exercicio_04;

import exercicio_01.*;

import java.util.List;

public class TestaZoologico {
    public static void main(String[] args) {
        Zoologico z1 = new Zoologico();
        List<Animal> animais = List.of(
                new Cachorro("C1", 10),
                new Preguica("P1", 20),
                new Cavalo("Ca1", 20),
                new Cachorro("C2", 15),
                new Preguica("P2", 9),
                new Cachorro("C3", 8),
                new Cavalo("Ca2", 10),
                new Cachorro("C4", 4),
                new Cavalo("Ca3", 21),
                new Preguica("P3", 11)
        );

        for (int i = 0; i < animais.size(); i++) {
            z1.adicionarAnimal(animais.get(i), i);
        }

        z1.percorrerJaulas();
    }
}
