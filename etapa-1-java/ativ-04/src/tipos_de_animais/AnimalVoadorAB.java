package tipos_de_animais;

public abstract class AnimalVoadorAB extends AnimalAB {
    private double envergaduraAsa;
    private int quantidadeAsas;

    public AnimalVoadorAB(String nome, String habitat, String tipoAnimal, int idade, double altura, double peso, int quantidadeAsas, double envergaduraAsa) {
        super(nome, habitat, tipoAnimal, idade, altura, peso);
        this.envergaduraAsa = envergaduraAsa;
        this.quantidadeAsas = quantidadeAsas;
    }

    // getter
    public double getEnvergaduraAsa() {
        return envergaduraAsa;
    }
    public int getQuantidadeAsas() {
        return quantidadeAsas;
    }

    // métodos
    public void voar() {
        System.out.println("Voando...");
    }
    public String toString() {
        return ("\n\nANIMAL VOADOR: " + getTipoAnimal() + ";\n\t"
                + "Nome: " + getNome() + ";\n\t"
                + "Habitat: " + getHabitat() + ";\n\t"
                + "Idade: " + getIdade() + " anos;\n\t"
                + "Altura: " + getAltura() + " metros;\n\t"
                + "Peso: " + getPeso() + "kg;\n\t"
                + "Quantidade de Asas: " + getQuantidadeAsas() + ";\n\t"
                + "Envergadura das Asas: " + getEnvergaduraAsa() + ".\n");
    }
    // métodos abstratos
    public abstract void comer();
    public abstract void moverse();
    public abstract void dormir();
}
