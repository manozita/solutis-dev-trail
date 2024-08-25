package exercicio_06;
import exercicio_01.Pessoa;
import exercicio_03.Empregado;

public class Vendedor extends Empregado {

    // variáveis
    double valorVendas, comissao;

    // construtores
    public Vendedor(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double imposto, double valorVendas, double comissao) {
        super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
        this.valorVendas = valorVendas;
        this.comissao = comissao;
    }
    public Vendedor(Pessoa pessoa, int codigoSetor, double salarioBase, double imposto, double valorVendas, double comissao) {
        super(pessoa, codigoSetor, salarioBase, imposto);
        this.valorVendas = valorVendas;
        this.comissao = comissao;
    }

    // getters e setters
    public double getValorVendas() {
        return valorVendas;
    }
    public void setValorVendas(double valorVendas) {
        this.valorVendas = valorVendas;
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
        double novoSalario = salario + valorVendas*comissao;
        return super.calcularSalario(novoSalario);
    }
    public String toString() {
        return (super.toString()
                + "\tSalário base com bonus: " + (getSalarioBase() + valorVendas*comissao)
                + "\n\tSalário líquido: " + calcularSalario(getSalarioBase()) + "\n");
    }
}
