import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) throws Exception {
        var scanner = new Scanner(System.in);
        String ans, invertida;
        invertida = "";

        System.out.println("Digite uma string: ");
        ans = scanner.nextLine();

        for (int i = ans.length() - 1; i >= 0; i--) {
            invertida += ans.charAt(i);
        }

        if (ans.equalsIgnoreCase(invertida)) {
            System.out.println(ans + " pode ser lida de tras para frente!");
        }
        else {
            System.out.println("A string nao pode ser lida de tras para frente.\nNormal: " + ans + "\nInvertida: " + invertida);
        }

        scanner.close();
    }
}

    
