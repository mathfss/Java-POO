import java.net.NetworkInterface;

public class Main {
    public static void main(String[] args) {


        Produto produto = new Produto("bone", 50);
        Camiseta camiseta = new Camiseta("Nike", 120, "preto", "M");
        Notebook notebook = new Notebook("Acer", 2500, 2000, "GPU", "intel");

        System.out.println(produto.etiquetaPreco());
        System.out.println(camiseta.etiquetaPreco());
        System.out.println(notebook.etiquetaPreco());


        }
    }