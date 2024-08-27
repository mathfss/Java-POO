// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        BrownieNutella brownieNutella = new BrownieNutella("nutellinha", 5, "nutella");
        BrownieCafe brownieCafe = new BrownieCafe("cafezin", 4, "café");
        BrownieDoceDeLeite brownieDoceDeLeite = new BrownieDoceDeLeite("leitin", 10, "leite");

        brownieCafe.adicionaCafe();
        brownieNutella.adicionaNutella();
        brownieDoceDeLeite.adicionaDoceDeLeite();
        brownieCafe.mostraInfo();
        brownieNutella.mostraInfo();
        brownieDoceDeLeite.mostraInfo();
        brownieCafe.addCarrinhoDeCompras();
        brownieNutella.calculaValorTotalCompra();
        brownieCafe.calculaValorTotalCompra();

    }
}