package animais;
import tipos_de_animais.AnimalTerrestreAB;

public class Elefante extends AnimalTerrestreAB {

    private int distAndada;
    private int comidaIngerida;
    private int horasDormidas;

    // construtor
    public Elefante(String nome, String habitat, String tipoAnimal, int idade, double altura, double peso, int quantidadePatas) {
        super(nome, habitat, tipoAnimal, idade, altura, peso, quantidadePatas);
        this.distAndada = 0;
        this.horasDormidas = 0;
        this.comidaIngerida = 0;
    }

    // métodos
    public String toString() {
        return super.toString();
    }

    @Override
    public void comer() {
        this.comidaIngerida+=8;
        System.out.println(this.getNome() + " comeu.");
        System.out.println("\tNo total, o elefante " + this.getNome() + " comeu " + this.comidaIngerida + " comidas.");
    }

    @Override
    public void moverse() {
        this.distAndada+=4;
        System.out.println(this.getNome() + " andou.");
        System.out.println("\tNo total, o elefante " + this.getNome() + " andou " + this.distAndada + " de distância.");
    }

    @Override
    public void dormir() {
        this.horasDormidas+=6;
        System.out.println(this.getNome() + " dormiu.");
        System.out.println("\tNo total, o elefante " + this.getNome() + " dormiu por " + this.horasDormidas + " horas.");
    }
}