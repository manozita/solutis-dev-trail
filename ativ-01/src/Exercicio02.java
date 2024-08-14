import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) throws Exception {
        var scanner = new Scanner(System.in);
        double A, B, maior;

        System.out.println("Digite o primeiro valor:");
        A = scanner.nextDouble();
        System.out.println("Digite o segundo valor:");
        B = scanner.nextDouble();

        maior = Math.max(A,B);

        System.out.println("O maior valor entre " + A + " e " + B + " é " + maior);

        scanner.close();
    }
}

    
