package exercicio_06;

import exercicio_01.Pessoa;

public class TesteVendedor {
    public static void main(String[] args) {
        // criar vendedor1
        Vendedor vendedor1 = new Vendedor("Nome", "Avenida XXXXX", "(11) 111-111", 1201, 3500, 0.25, 0, 0);
        // valor de vendas e comissão definidos como 0
        // alterando valores na classe vendedor
        vendedor1.setValorVendas(5800);
        vendedor1.setComissao(0.15);

        // criar vendedor2 a partir de uma pessoa
        Pessoa pessoa1 = new Pessoa("Manoela","Barueri, SP", "(11) 999-999");
        Vendedor vendedor2 = new Vendedor(pessoa1, 1101, 6000, 0.27, 8000, 0.15);

        // impressao de dados
        System.out.println("----------Vendedor1----------\n" + vendedor1);

        System.out.println("----------Pessoa1----------\n" + pessoa1);
        System.out.println("\tCriar vendedor a partir da pessoa1");

        // imprimindo informacoes do vendedor2 diretamente pelo metodo main
        System.out.println("----------Vendedor2----------\n");
        System.out.println("\tNome: " + vendedor2.getNome()
                + "\n\tCodigo do setor: " + vendedor2.getCodigoSetor()
                + "\n\tSalário base com bonus: " + (vendedor2.getSalarioBase() + vendedor2.getValorVendas()*vendedor2.getComissao())
                + "\n\tImposto: " + vendedor2.getImposto()*100 + "%"
                + "\n\tSalário líquido: " + vendedor2.calcularSalario(vendedor2.getSalarioBase()) + "\n");
    }
}
