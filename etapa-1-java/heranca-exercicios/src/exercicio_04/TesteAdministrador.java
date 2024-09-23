package exercicio_04;
import exercicio_01.Pessoa;

public class TesteAdministrador {
    public static void main(String[] args) {
        // criar administrador1
        Administrador admin1 = new Administrador("Nome", "Avenida XXXXX", "(11) 111-111", 1201, 3500, 0.25, 0);
        // ajuda de custo definida como 0
        // alterando valores na classe administrador
        admin1.setAjudaDeCusto(1250);

        // criar administrador2 a partir de uma pessoa
        Pessoa pessoa1 = new Pessoa("Manoela","Barueri, SP", "(11) 999-999");
        Administrador admin2 = new Administrador(pessoa1, 1101, 6000, 0.27, 950);

        // impressao de dados
        System.out.println("----------Admin1----------\n" + admin1);

        System.out.println("----------Pessoa1----------\n" + pessoa1);
        System.out.println("\tCriar administrador a partir da pessoa1");

        // imprimindo informacoes do administrador2 diretamente pelo metodo main
        System.out.println("----------Admin2----------\n");
        System.out.println("\tNome: " + admin2.getNome()
                + "\n\tCodigo do setor: " + admin2.getCodigoSetor()
                + "\n\tSalário base com ajuda de custo: " + (admin2.getSalarioBase()+admin2.getAjudaDeCusto())
                + "\n\tImposto: " + admin2.getImposto()*100 + "%"
                + "\n\tSalário líquido: " + admin2.calcularSalario(admin2.getSalarioBase()) + "\n");
    }
}
