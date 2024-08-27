// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Quarto[] quartos = new Quarto[50];
        Casa casa = new Casa("rua alameda", "verde", quartos);

        Quarto quarto1 = new Quarto();
        quarto1.setArea(50);
        Quarto quarto2 = new Quarto();
        quarto2.setArea(54);
        Quarto quarto3 = new Quarto();
        quarto3.setArea(42);
        Quarto quarto4 = new Quarto();
        quarto4.setArea(41);

        quarto1.setNumeroDeJanelas(1);
        quarto2.setNumeroDeJanelas(2);
        quarto3.setNumeroDeJanelas(3);
        quarto4.setNumeroDeJanelas(4);

        System.out.println(casa.constroiQuarto(quarto1, 0));
        System.out.println(casa.constroiQuarto(quarto2, 1));
        System.out.println(casa.constroiQuarto(quarto3, 2));
        System.out.println(casa.constroiQuarto(quarto4, 3));

        System.out.println(casa.CalculaAreaTotalDaCasa());

        casa.mostraInfo();

    }
}