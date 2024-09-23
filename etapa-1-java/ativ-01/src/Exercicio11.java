import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) throws Exception {
        var scanner = new Scanner(System.in);
        String p1, p2;

        System.out.println("Digite uma palavra: ");
        p1 = scanner.nextLine();

        System.out.println("Digite outra palavra: ");
        p2 = scanner.nextLine();
        scanner.close();

        if (p1.compareTo(p2) > 0) {
            System.out.println("Ordem alfabetica: " + p2 + ", " + p1);
        } else {
            System.out.println("Ordem alfabetica: " + p1 + ", " + p2);
        }
        
        if (p1.length() > p2.length()) {
            System.out.println("A palavra com mais caracteres e: " + p1);
        } else if (p1.length() < p2.length()) {
            System.out.println("A palavra com mais caracteres e: " + p2);
        } else {
            System.out.println("As duas palavras tem o mesmo numero de caracteres.");
        }
    }
}