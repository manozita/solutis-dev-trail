package exercicio_03;
import exercicio_01.Pessoa;

public class Empregado extends Pessoa {
    // variáveis
    int codigoSetor;
    double salarioBase, imposto;

    // construtores
    public Empregado(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double imposto) {
        super(nome, endereco, telefone);
        this.codigoSetor = codigoSetor;
        this.salarioBase = salarioBase;
        this.imposto = imposto;
    }

    public Empregado(Pessoa pessoa, int codigoSetor, double salarioBase, double imposto) {
        super(pessoa.getNome(), pessoa.getEndereco(), pessoa.getTelefone());
        this.codigoSetor = codigoSetor;
        this.salarioBase = salarioBase;
        this.imposto = imposto;
    }

    // getters e setters
    public int getCodigoSetor() {
        return codigoSetor;
    }
    public void setCodigoSetor(int codigoSetor) {
        this.codigoSetor = codigoSetor;
    }
    public double getSalarioBase() {
        return salarioBase;
    }
    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
    public double getImposto() {
        return imposto;
    }
    public void setImposto(double imposto) {
        this.imposto = imposto;
    }

    // métodos
    public double calcularSalario() {
        return salarioBase - (salarioBase * imposto);
    }
    public String toString() {
        return (super.toString()
                + "\tCódigo do setor: " + codigoSetor
                + "\n\tSalário base: " + salarioBase
                + "\n\tImposto: " + imposto*100 + "%"
                + "\n\tSalário líquido: " + calcularSalario() + "\n");
    }
}
