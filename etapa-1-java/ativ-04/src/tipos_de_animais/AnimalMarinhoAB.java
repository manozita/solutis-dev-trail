package tipos_de_animais;

public abstract class AnimalMarinhoAB extends AnimalAB {

    private int qtdNadadeiras;

    // construtor
    public AnimalMarinhoAB(String nome, String habitat, String tipoAnimal, int idade, double altura, double peso, int qtdNadadeiras) {
        super(nome, habitat, tipoAnimal, idade, altura, peso);
        this.qtdNadadeiras = qtdNadadeiras;
    }

    //getter
    public int getQtdNadadeiras() {
        return qtdNadadeiras;
    }

    // métodos

    public void nadar() {
        System.out.println("Nadando...");
    }
    public String toString() {
        return ("\n\nANIMAL MARINHO: " + getTipoAnimal() + ";\n\t"
                + "Nome: " + getNome() + ";\n\t"
                + "Habitat: " + getHabitat() + ";\n\t"
                + "Idade: " + getIdade() + " anos;\n\t"
                + "Altura: " + getAltura() + " metros;\n\t"
                + "Peso: " + getPeso() + "kg;\n\t"
                + "Quantidade de Nadadeiras: " + getQtdNadadeiras() + ".\n");
    }

    // métodos abstratos
    public abstract void comer();
    public abstract void moverse();
    public abstract void dormir();
}
