public class Exercicio06 {
    public static void main(String[] args) throws Exception {
        int prodInt = 1;
        float prodFloat = 1;

        for (int i = 15; i <= 30; i++) {
            if (i%2==0) {
                prodInt*=i;
                prodFloat*=i;
            }
        }

        System.out.println("Produto int: " + prodInt);
        System.out.println("Produto float: " + prodFloat);
    }
}
