import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) throws Exception {
        var scanner = new Scanner(System.in);
        int A, B, temp;

        System.out.println("Digite o valor de A:");
        A = scanner.nextInt();

        System.out.println("Digite o valor de B:");
        B = scanner.nextInt();

        temp = A;
        A = B;
        B = temp;

        System.out.println("Valores trocados: ");
        System.out.println("A: " + A);
        System.out.println("B: " + B);

        scanner.close();
    }
}
