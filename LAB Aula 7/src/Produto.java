public class Produto {
    String nome;
    double preco;

    public String etiquetaPreco(){
        return nome + " " + preco;
    }

    public Produto(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }
}
