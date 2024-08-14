import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) throws Exception {
        var scanner = new Scanner(System.in);
        var codigo = "";
        var produto = "";

        System.out.print("Digite o código do produto: ");
        codigo = scanner.nextLine();
        
        if (codigo.equals("001")) {
            produto = "Parafuso";
        } else if (codigo.equals("002")) {
            produto = "Porca";
        } else if (codigo.equals("003")) {
            produto = "Prego";
        } else {
            produto = "Diversos";
        }

        System.out.println("Nome do produto: " + produto);
        scanner.close();
    }
}
