package exercicio_03;
import exercicio_01.Pessoa;

public class TesteEmpregado {
    public static void main(String[] args) {

        // criar empregado1
        Empregado empregado1 = new Empregado("Nome", "Avenida XXXXX", "(11) 111-111", 0, 0, 0);
        // codigo, salario e impostos definidos como 0
        // alterando valores na classe empregado
        empregado1.setCodigoSetor(1201);
        empregado1.setSalarioBase(3500);
        empregado1.setImposto(0.25);

        // criar empregado2 a partir de uma pessoa
        Pessoa pessoa1 = new Pessoa("Manoela","Barueri, SP", "(11) 999-999");
        Empregado empregado2 = new Empregado(pessoa1, 1101, 6000, 0.27);

        // impressao de dados
        System.out.println("----------Empregado1----------\n" + empregado1 + "\n\tSalário líquido: " + empregado1.calcularSalario(empregado1.salarioBase) + "\n");

        System.out.println("----------Pessoa1----------\n" + pessoa1);
        System.out.println("\tCriar empregado a partir da pessoa1");

        // imprimindo informacoes do empregado2 diretamente pelo metodo main
        System.out.println("----------Empregado2----------\n");
        System.out.println("\tNome: " + empregado2.getNome()
                + "\n\tCodigo do setor: " + empregado2.getCodigoSetor()
                + "\n\tSalário base: " + empregado2.getSalarioBase()
                + "\n\tImposto: " + empregado2.getImposto()*100 + "%" + "\n"
                + "\n\tSalário líquido: " + empregado2.calcularSalario(empregado2.salarioBase) + "\n");
    }
}
