public class Main {
    public static void main(String[] args) {

        Zumbi z1 = new Zumbi();
        Zumbi z2 = new Zumbi();

        z1.vida = 100;
        z2.vida = 50;

        System.out.print("Vida do zumbi 1: ");
        System.out.println(z1.vida);
        System.out.print("Vida do zumbi 2: ");
        System.out.println(z2.vida);

        z1 = z2;
        System.out.println();

        System.out.print("Vida do zumbi 1: ");
        System.out.println(z1.vida);
        System.out.print("Vida do zumbi 2: ");
        System.out.println(z2.vida);
        System.out.println();

        System.out.print("Transferencia de vida: ");
        System.out.println(z1.transfereVida(z2, 85));

    }
}