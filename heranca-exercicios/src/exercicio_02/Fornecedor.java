package exercicio_02;
import exercicio_01.Pessoa;

public class Fornecedor extends Pessoa {
    // variáveis
    private double valorCredito, valorDivida;

    // construtores
    public Fornecedor(String nome, String endereco, String telefone, double valorCredito, double valorDivida) {
        super(nome, endereco, telefone);
        this.valorCredito = valorCredito;
        this.valorDivida = valorDivida;
    }

    public Fornecedor(String nome, String endereco, String telefone) {
        super(nome, endereco, telefone);
        this.valorCredito = 0;
        this.valorDivida = 0;
    }

    // construtor fornecedor com uma pessoa
    public Fornecedor(Pessoa pessoa, double valorCredito, double valorDivida) {
        super(pessoa.getNome(), pessoa.getEndereco(), pessoa.getTelefone());
        this.valorCredito = valorCredito;
        this.valorDivida = valorDivida;
    }

    // getters e setters
    public double getValorCredito() {
        return valorCredito;
    }
    public void setValorCredito(double valorCredito) {
        this.valorCredito = valorCredito;
    }
    public double getValorDivida() {
        return valorDivida;
    }
    public void setValorDivida(double valorDivida) {
        this.valorDivida = valorDivida;
    }

    // metodos
    public double obterSaldo() {
        return valorCredito - valorDivida;
    }
    public String toString() {
        return (super.toString()
                + "\tValor crédito: " + valorCredito
                + "\n\tValor divida: " + valorDivida + "\n");
    }
}
