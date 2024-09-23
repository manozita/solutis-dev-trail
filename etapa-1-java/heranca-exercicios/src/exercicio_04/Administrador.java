package exercicio_04;
import exercicio_01.Pessoa;
import exercicio_03.Empregado;

public class Administrador extends Empregado {
    // variável
    double ajudaDeCusto;

    // construtores
    public Administrador(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double imposto, double ajudaDeCusto) {
        super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
        this.ajudaDeCusto = ajudaDeCusto;
    }
    public Administrador(Pessoa pessoa, int codigoSetor, double salarioBase, double imposto, double ajudaDeCusto) {
        super(pessoa, codigoSetor, salarioBase, imposto);
        this.ajudaDeCusto = ajudaDeCusto;
    }

    // getters e setters
    public double getAjudaDeCusto() {
        return ajudaDeCusto;
    }
    public void setAjudaDeCusto(double ajudaDeCusto) {
        this.ajudaDeCusto = ajudaDeCusto;
    }

    // métodos
    @Override
    public double calcularSalario(double salario) {
        double novoSalario = salario + ajudaDeCusto;
        return super.calcularSalario(novoSalario);
    }
    public String toString() {
        return (super.toString()
                + "\tSalário base com ajuda de custo: " + (getSalarioBase()+ajudaDeCusto)
                + "\n\tSalário líquido: " + calcularSalario(getSalarioBase()) + "\n");
    }
}
