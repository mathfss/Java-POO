public class Main {

    public static void main(String[] args) {

        Zumbi zumbi1 = new Zumbi();
        Zumbi zumbi2 = new Zumbi();

        zumbi1.tamanho = "Grande";
        zumbi1.fome = "Sim";
        zumbi1.comerCerebro(3);
        zumbi1.movimentar("Correr");

        zumbi2.tamanho = "Pequeno";
        System.out.println(zumbi2.tamanho);
        zumbi2.fome = "Nao";
        zumbi2.comerCerebro(0);
        zumbi2.movimentar("Andar");

    }
}
