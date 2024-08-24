package animais;
import tipos_de_animais.AnimalVoadorAB;

public class Pombo extends AnimalVoadorAB {

    private int distVoada;
    private int comidaIngerida;
    private int horasDormidas;

    // construtor
    public Pombo(String nome, String habitat, String tipoAnimal, int idade, double altura, double peso, int quantidadeAsas, double envergaduraAsa) {
        super(nome, habitat, tipoAnimal, idade, altura, peso, quantidadeAsas, envergaduraAsa);
        this.distVoada = 0;
        this.comidaIngerida = 0;
        this.horasDormidas = 0;
    }

    // métodos
    @Override
    public void comer() {
        this.comidaIngerida+=3;
        System.out.println(this.getNome() + " comeu.");
        System.out.println("\tNo total, o pombo " + this.getNome() + " comeu " + this.comidaIngerida + " comidas.");
    }

    @Override
    public void moverse() {
        this.distVoada+=5;
        System.out.println(this.getNome() + " voou.");
        System.out.println("\tNo total, o pombo " + this.getNome() + " voou " + this.distVoada + " de distância.");
    }

    @Override
    public void dormir() {
        this.horasDormidas+=3;
        System.out.println(this.getNome() + " dormiu.");
        System.out.println("\tNo total, o pombo " + this.getNome() + " dormiu por " + this.horasDormidas + " horas.");
    }
}
