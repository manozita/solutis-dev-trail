public class Exercicio12 {
    public static void main(String[] args) throws Exception {
        int resInt; double resDouble;

        for (int i = 1; i <= 100; i++) {
            if (i%3==0) {
                resInt = i/2;
                resDouble = (double)i/2;
                System.out.println("Número: " + i);
                System.out.println("\tDivisão por 2 (int): " + resInt);
                System.out.println("\tDivisão por 2 (double): " + resDouble);
            }
        }
    }
}
