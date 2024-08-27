public class Brownie {
    protected String nome;
    protected double preco;
    protected String sabor;

    public Brownie(String nome, double preco, String sabor){
        this.nome = nome;
        this.preco = preco;
        this.sabor = sabor;
    }

    public void addCarrinhoDeCompras(){
        System.out.println("Adicionando no carrinho: " + nome);
    }

    public void calculaValorTotalCompra(){
        System.out.println("Calculando o valor total da compra: "+ nome + " " +preco);
    }

    public void mostraInfo(){
        System.out.println("Nome: " + nome);
        System.out.println("Preço: " +preco);
        System.out.println("Sabor: " + sabor);
    }
}
