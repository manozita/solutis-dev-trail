import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) throws Exception {
        var scanner = new Scanner(System.in);
        var ans = "";
        int N;

        System.out.println("Digite um numero inteiro:");
        N = scanner.nextInt();

        ans = (N%2==0)? "par" : "impar"; // verifica se o resto da divisao do numero por 2 e 0
        System.out.println(N + " é " + ans);
        
        scanner.close();
    }
}
