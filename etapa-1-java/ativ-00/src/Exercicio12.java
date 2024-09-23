public class Exercicio12 {
    public static void main(String[] args) throws Exception {

        for (int i = 1; i <= 100; i++) {
            if (i%3==0) {
                System.out.println("Número: " + i);
                System.out.println("\tDivisão por 2 (int): " + (int)i/2);
                System.out.println("\tDivisão por 2 (double): " + (double)i/2);
            }
        }
    }
}
