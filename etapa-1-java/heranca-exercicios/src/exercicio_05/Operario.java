package exercicio_05;
import exercicio_01.Pessoa;
import exercicio_03.Empregado;

public class Operario extends Empregado {

    // variáveis
    double valorProducao, comissao;

    // construtores
    public Operario(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double imposto, double valorProducao, double comissao) {
        super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
        this.valorProducao = valorProducao;
        this.comissao = comissao;
    }
    public Operario(Pessoa pessoa, int codigoSetor, double salarioBase, double imposto, double valorProducao, double comissao) {
        super(pessoa, codigoSetor, salarioBase, imposto);
        this.valorProducao = valorProducao;
        this.comissao = comissao;
    }

    // getters e setters
    public double getValorProducao() {
        return valorProducao;
    }
    public void setValorProducao(double valorProducao) {
        this.valorProducao = valorProducao;
    }
    public double getComissao() {
        return comissao;
    }
    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    // métodos
    @Override
    public double calcularSalario(double salario) {
        double novoSalario = salario + valorProducao*comissao;
        return super.calcularSalario(novoSalario);
    }
    public String toString() {
        return (super.toString()
                + "\tSalário base com bonus: " + (getSalarioBase() + valorProducao*comissao)
                + "\n\tSalário líquido: " + calcularSalario(getSalarioBase()) + "\n");
    }
}
