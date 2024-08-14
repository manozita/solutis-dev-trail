import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) throws Exception {
        var scanner = new Scanner(System.in);
        String diasDaSemana[] = {"Segunda", "Terca", "Quarta", "Quinta", "Sexta", "Sabado", "Domingo"};
        int dia;

        System.out.println("Digite um numero de 1 a 7: ");
        dia = scanner.nextInt();

        if (dia > 7 || dia < 1) {
            System.out.println("Numero invalido.");
        } else {
            System.out.println("Dia da semana " + dia + ": " + diasDaSemana[dia-1]);
        }

        scanner.close();
    }
}

    
