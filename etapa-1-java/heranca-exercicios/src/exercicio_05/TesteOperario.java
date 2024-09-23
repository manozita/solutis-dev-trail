package exercicio_05;
import exercicio_01.Pessoa;

public class TesteOperario {
    public static void main(String[] args) {
        // criar operario1
        Operario operario1 = new Operario("Nome", "Avenida XXXXX", "(11) 111-111", 1201, 3500, 0.25, 0, 0);
        // valor de produção e comissão definidos como 0
        // alterando valores na classe operario
        operario1.setValorProducao(5800);
        operario1.setComissao(0.15);

        // criar operario2 a partir de uma pessoa
        Pessoa pessoa1 = new Pessoa("Manoela","Barueri, SP", "(11) 999-999");
        Operario operario2 = new Operario(pessoa1, 1101, 6000, 0.27, 8000, 0.15);

        // impressao de dados
        System.out.println("----------Operário1----------\n" + operario1);

        System.out.println("----------Pessoa1----------\n" + pessoa1);
        System.out.println("\tCriar operário a partir da pessoa1");

        // imprimindo informacoes do operario2 diretamente pelo metodo main
        System.out.println("----------Operario2----------\n");
        System.out.println("\tNome: " + operario2.getNome()
                + "\n\tCodigo do setor: " + operario2.getCodigoSetor()
                + "\n\tSalário base com bonus: " + (operario2.getSalarioBase() + operario2.getValorProducao()*operario2.getComissao())
                + "\n\tImposto: " + operario2.getImposto()*100 + "%"
                + "\n\tSalário líquido: " + operario2.calcularSalario(operario2.getSalarioBase()) + "\n");
    }
}
