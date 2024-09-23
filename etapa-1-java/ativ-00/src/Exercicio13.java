public class Exercicio13 {
    public static void main(String[] args) throws Exception {
        int dado1, dado2;
        final int target = 7;

        for (dado1 = 1; dado1 <= 6; dado1++) {
            for (dado2 = 1; dado2 <= 6; dado2++) {
                if (dado1+dado2 == target) {
                    System.out.println("Dado 1 = " + dado1 + ", Dado 2 = " + dado2);
                }
            }
        }
    }
}
