package animais;
import tipos_de_animais.AnimalMarinhoAB;

public class Peixe extends AnimalMarinhoAB {

    private int distNadada;
    private int comidaIngerida;
    private int horasDormidas;

    // construtor
    public Peixe(String nome, String habitat, String tipoAnimal, int idade, double altura, double peso, int qtdNadadeiras) {
        super(nome, habitat, tipoAnimal, idade, altura, peso, qtdNadadeiras);
        this.distNadada = 0;
        this.comidaIngerida = 0;
        this.horasDormidas = 0;
    }

    // métodos
    public String toString() {
        return super.toString();
    }

    @Override
    public void comer() {
        this.comidaIngerida+=1;
        System.out.println(this.getNome() + " comeu.");
        System.out.println("\tNo total, o peixe " + this.getNome() + " comeu " + this.comidaIngerida + " comidas.");
    }

    @Override
    public void moverse() {
        this.distNadada+=1;
        System.out.println(this.getNome() + " nadou.");
        System.out.println("\tNo total, o peixe " + this.getNome() + " nadou " + this.distNadada + " de distância.");
    }

    @Override
    public void dormir() {
        this.horasDormidas+=2;
        System.out.println(this.getNome() + " dormiu.");
        System.out.println("\tNo total, o peixe " + this.getNome() + " dormiu por " + this.horasDormidas + " horas.");
    }
}
