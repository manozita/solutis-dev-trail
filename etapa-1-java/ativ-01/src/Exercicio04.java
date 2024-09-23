import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) throws Exception {
        var scanner = new Scanner(System.in);
        double dMilhas, dKm;

        System.out.println("Digite a distancia, em milhas: ");
        dMilhas = scanner.nextDouble();

        dKm = dMilhas*1.609;

        System.out.println(dMilhas + " milhas = " + dKm + " quilometros.");
        
        scanner.close();
    }
}