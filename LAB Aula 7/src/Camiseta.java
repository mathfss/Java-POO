public class Camiseta extends Produto {

    String cor;
    String tamanho;

    public String etiquetaPreco() {
        return super.etiquetaPreco() + " " + cor + " " + tamanho;
    }

    public Camiseta(String nome, double preco, String cor, String tamanho){
        super (nome, preco);
        this.cor = cor;
        this.tamanho = tamanho;
    }

}
