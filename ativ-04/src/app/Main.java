package app;
import animais.*;

public class Main {
    public static void main(String[] args) {
        testarAnimaisMarinhos();
        testarAnimaisVoadores();
        testarAnimaisTerrestres();
    }
    private static void testarAnimaisMarinhos() {
        Peixe peixe = new Peixe("Tilápia", "Águas doces e salobras", "Peixe", 5, 0.3, 2, 7);
        System.out.println(peixe);
        peixe.nadar();
        peixe.comer(); peixe.dormir(); peixe.moverse();
    }
    private static void testarAnimaisVoadores() {
        Pombo pombo = new Pombo("Pombo-doméstico", "Áreas urbanas e rurais", "Ave", 10, 0.3, 0.4, 2, 0.6);
        System.out.println(pombo);
        pombo.voar();
        pombo.comer(); pombo.dormir(); pombo.moverse();
    }
    private static void testarAnimaisTerrestres() {
        Cachorro cachorro = new Cachorro("Labrador Retriever", "Doméstico", "Mamífero", 12, 0.6, 36, 4);
        System.out.println(cachorro);
        cachorro.andar();
        cachorro.moverse(); cachorro.moverse();

        Gato gato = new Gato("Gato-doméstico", "Doméstico", "Mamífero", 15, 0.3, 4.5, 4);
        System.out.println(gato);
        gato.andar();
        gato.dormir(); gato.moverse(); gato.dormir();

        Elefante elefante = new Elefante("Elefante-africano", "Savanas e florestas da África", "Mamífero", 70, 3.3, 6000, 4);
        System.out.println(elefante);
        elefante.andar();
        elefante.comer(); elefante.comer();

        Leao leao = new Leao("Leão", "Savanas e pastagens da África", "Mamífero", 14, 1.2, 250, 4);
        System.out.println(leao);
        leao.andar();
        leao.comer(); leao.comer(); leao.moverse(); leao.moverse();
    }

}
