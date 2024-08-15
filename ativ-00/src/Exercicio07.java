import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) throws Exception {
        var scanner = new Scanner(System.in);
        String A, B, temp;

        System.out.println("Digite o valor de A: ");
        A = scanner.nextLine();

        System.out.println("Digite o valor de B: ");
        B = scanner.nextLine();

        temp = A;
        A = B;
        B = temp;

        System.out.println("Valores trocados: ");
        System.out.println("A: " + A);
        System.out.println("B: " + B);

        scanner.close();
    }
}
