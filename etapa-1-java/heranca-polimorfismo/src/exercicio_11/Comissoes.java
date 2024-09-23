package exercicio_11;

public abstract class Comissoes {
    // variável
    private double adicional;

    // construtor
    public Comissoes (double adicional) {
        this.adicional = adicional;
    }

    // metodo
    public double getAdicional() {
        return adicional;
    }
}
