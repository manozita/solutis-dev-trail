package tipos_de_animais;

public abstract class AnimalAB implements AnimalIF {

    private String nome, habitat, tipoAnimal;
    private int idade;
    private double altura, peso;

    // construtor
    public AnimalAB(String nome, String habitat, String tipoAnimal, int idade, double altura, double peso) {
        this.nome = nome;
        this.habitat = habitat;
        this.tipoAnimal = tipoAnimal;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
    }

    // getters e setters
    public String getNome() {
        return nome;
    }
    public String getHabitat() {
        return habitat;
    }
    public String getTipoAnimal() {
        return tipoAnimal;
    }
    public int getIdade() {
        return idade;
    }
    public double getAltura() {
        return altura;
    }
    public double getPeso() {
        return peso;
    }

    // métodos abstratos
    public abstract void comer();
    public abstract void moverse();
    public abstract void dormir();
}
