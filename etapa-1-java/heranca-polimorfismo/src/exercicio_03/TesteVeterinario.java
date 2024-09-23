package exercicio_03;

import exercicio_01.Cachorro;
import exercicio_01.Cavalo;
import exercicio_01.Preguica;

public class TesteVeterinario {
    public static void main(String[] args) {

        // animais e veterinário
        Veterinario vet = new Veterinario();
        Cachorro cachorro = new Cachorro("Poodle", 11);
        Cavalo cavalo = new Cavalo("Cavalo andaluz", 20);
        Preguica preguica = new Preguica("Preguica real", 25);

        // veterinario examinar animais
        System.out.println("----O veterinário examinará os animais----");
        vet.examinar(cachorro);
        vet.examinar(cavalo);
        vet.examinar(preguica);
    }
}
