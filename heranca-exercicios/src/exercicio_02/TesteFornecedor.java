package exercicio_02;
import exercicio_01.Pessoa;

public class TesteFornecedor {
    public static void main(String[] args) {

        Fornecedor fornecedor1 = new Fornecedor("Nome1", "Endereco1", "Telefone1");
        // valores de divida e crédito como 0 na classe fornecedor

        Fornecedor fornecedor2 = new Fornecedor("Nome2", "Endereco2", "Telefone2", 1000, 199.99);
        // valores de divida e crédito no próprio construtor

        Pessoa pessoa1 = new Pessoa("Manoela", "(11) 994XX-XXXX");
        Fornecedor fornecedor3 = new Fornecedor(pessoa1, 5000, 99.99);
        // criando um fornecedor a partir de uma pessoa criada

        // -------- setters
            // classe pessoa
        fornecedor1.setEndereco("Avenida XXXXXX, 1111, Apto 11");
        fornecedor1.setTelefone("(11) 555-5555");
        fornecedor1.setNome("Fornecedor1");

        fornecedor2.setEndereco("Avenida YYYYYY, 555555, Apto 55");
        fornecedor2.setTelefone("(11) 999-9999");
        fornecedor2.setNome("Fornecedor2");

            // classe fornecedor
        fornecedor1.setValorCredito(5000);
        fornecedor1.setValorDivida(6845.50);

        fornecedor3.setValorDivida(999.99);

        // -------- impressao de valores
        System.out.println("----------Fornecedor1----------\n" + fornecedor1.toString());
        // metodo obterSaldo
        System.out.println("\tSaldo do fornecedor " + fornecedor1.getNome() + ": " + fornecedor1.obterSaldo());
        // alterando o valor de credito e divida e novo saldo
        fornecedor1.setValorDivida(200.80);
        fornecedor1.setValorCredito(599.99);
        System.out.println("\tNovo valor de crédito: " + fornecedor1.getValorCredito());
        System.out.println("\tNovo valor de dívida: " + fornecedor1.getValorDivida());
        System.out.println("\tNovo saldo: " + fornecedor1.obterSaldo());

        System.out.println("\n----------Fornecedor2----------\n" + fornecedor2.toString());
        // metodo obterSaldo
        System.out.println("\tSaldo do fornecedor " + fornecedor2.getNome() + ": " + fornecedor2.obterSaldo());

        System.out.println("\n------------Pessoa1------------\n" + pessoa1.toString());

        System.out.println("Formar Fornecedor 3 a partir da Pessoa1");
        System.out.println("\n----------Fornecedor3----------\n" + fornecedor3.toString());
        // metodo obterSaldo
        System.out.println("\tSaldo do fornecedor " + fornecedor3.getNome() + ": " + fornecedor3.obterSaldo());
        // alterar o endereço da pessoa
        fornecedor3.setEndereco("Barueri, São Paulo, Brasil");
        System.out.println("\tNovo endereço: " + fornecedor3.getEndereco());
    }
}
