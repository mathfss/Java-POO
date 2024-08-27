public class Notebook extends Produto {

    double armazenamento;
    String gpu;
    String processador;

    public Notebook(String nome, double preco, double armazenamento, String gpu, String processador) {
        super(nome, preco);
        this.armazenamento = armazenamento;
        this.gpu = gpu;
        this.processador = processador;
    }


    public String etiquetaPreco() {
        return super.etiquetaPreco() + armazenamento + " " + gpu + " " + processador;
    }
}
