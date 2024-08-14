import java.util.Scanner;

public class Exercicio03 {
    public static boolean numeroPrimo(int N) {
        if (N <= 1)
            return false;

        for (int i = 2; i <= Math.sqrt(N); i++) {
            if (N%i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) throws Exception {
        var scanner = new Scanner(System.in);
        int num;

        System.out.println("Digite um valor inteiro:");
        num = scanner.nextInt();

        for (int i = 2; i > num; i++) {
            if (numeroPrimo(i))
                System.out.println(i);
        }
        
        scanner.close();
    }
}

    
