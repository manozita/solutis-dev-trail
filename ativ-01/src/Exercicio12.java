import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) throws Exception {
        var scanner = new Scanner(System.in);
        int qtdKm, qtdLitros, totalKm, totalLitros;
        double consumo;
        totalKm = totalLitros = 0;

        while (true) {
            System.out.println("Digite a quantidade de quilometros dirigidos (ou -1 para sair): ");
            qtdKm = scanner.nextInt();

            if (qtdKm == -1) break;

            System.out.println("Digite os litros de gasolina consumidos: ");
            qtdLitros = scanner.nextInt();

            totalKm += qtdKm; totalLitros += qtdLitros;
            consumo = (double) qtdKm/qtdLitros;

            System.out.println("O consumo em km/L para este tanque e de: " + consumo);
            System.out.println("A soma total de litros consumidos e de: " + totalLitros);
            System.out.println("A soma total de quilometros percorridos e de: " + totalKm);
        }
        scanner.close();

    }
}