package exercicio_04;

import exercicio_01.Animal;
import exercicio_01.Cachorro;
import exercicio_01.Cavalo;
import exercicio_01.Preguica;

public class Zoologico {
    private Animal[] jaulas;

    public Zoologico() {
        jaulas = new Animal[10];
    }

    public void adicionarAnimal (Animal animal, int pos) {
        if (pos >= 0 && pos < jaulas.length) {
            jaulas[pos] = animal;
        }
    }

    public void percorrerJaulas () {
        int index = 1;
        for (Animal animal : jaulas) {
            if (animal != null) {
                System.out.println("\n---Jaula " + index + ""); index++;
                animal.emitirSom();
                if (animal instanceof Preguica) {
                    ((Preguica) animal).subirArvore();
                }
                else if (animal instanceof Cachorro) {
                    ((Cachorro)animal).correr();
                }
                else {
                    ((Cavalo)animal).correr();
                }
            }
        }
    }
}

