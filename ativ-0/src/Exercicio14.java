import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) throws Exception {
        var scanner = new Scanner(System.in);
        double media, soma = 0;
        int i = 0, qtd = 50;

        while (i < qtd) {
            System.out.print("Digite um número: ");
            soma += scanner.nextDouble();
            i++;
        }

        media = soma/qtd;
        System.out.print("A media aritmetica e: " + media);
        scanner.close();
    }
}
