package tipos_de_animais;

public abstract class AnimalTerrestreAB extends AnimalAB {
    private int quantidadePatas;

    public AnimalTerrestreAB(String nome, String habitat, String tipoAnimal, int idade, double altura, double peso, int quantidadePatas) {
        super(nome, habitat, tipoAnimal, idade, altura, peso);
        this.quantidadePatas = quantidadePatas;
    }

    // getter
    public int getQuantidadePatas() {
        return quantidadePatas;
    }

    // métodos
    public void andar() {
        System.out.println("Andando...");
    }
    public String toString() {
        return ("\n\nANIMAL TERRESTRE: " + getTipoAnimal() + ";\n\t"
                + "Nome: " + getNome() + ";\n\t"
                + "Habitat: " + getHabitat() + ";\n\t"
                + "Idade: " + getIdade() + " anos;\n\t"
                + "Altura: " + getAltura() + " metros;\n\t"
                + "Peso: " + getPeso() + "kg;\n\t"
                + "Quantidade de Patas: " + getQuantidadePatas() + ".\n");
    }
    // métodos abstratos
    public abstract void comer();
    public abstract void moverse();
    public abstract void dormir();
}
