public class Exercicio07 {
    public static void main(String[] args) throws Exception {
        for (int i = 1; i <= 100; i++) {
            if (i%3==0) {
                System.out.println("Numero " + i);
                System.out.println("\tResultado int: " + (int)i/2);
                System.out.println("\tResultado double: " + (double)i/2);
            }
        }

    }
}
