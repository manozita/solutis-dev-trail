import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) throws Exception {
        var scanner = new Scanner(System.in);
        final int qtd = 5;
        double media, soma = 0;
        int i = 0;

        do {
            System.out.print("Digite um número: ");
            soma += scanner.nextDouble();
            i++;
        } while (i < qtd);

        media = soma/qtd;
        System.out.print("A media aritmetica e: " + media);
        scanner.close();
    }
}
