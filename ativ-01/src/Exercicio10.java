import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) throws Exception {
        var scanner = new Scanner(System.in);
        char[] cadeia;
        int vogais, consoantes, espacos;
        vogais = consoantes = espacos = 0;

        System.out.println("Digite uma string: ");
        cadeia = scanner.nextLine().toCharArray();
        scanner.close();

        for (char caractere : cadeia) {
            switch (Character.toUpperCase(caractere)) {
                case 'A','E','I','O','U':
                    vogais++;
                    break;
                case ' ':
                    espacos++;
                    break;
                default:
                    if (Character.isLetter(caractere)) {
                        consoantes++;
                    }
                    break;
            }
        }
    }
}