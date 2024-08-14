import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) throws Exception {
        var scanner = new Scanner(System.in);
        Double raio, area;

        System.out.println("Informe o raio do circulo: ");
        raio = scanner.nextDouble();
        scanner.close();

        area = Math.PI*raio*raio;

        System.out.printf("Area do circulo: %.2f%n", area);
    }
}