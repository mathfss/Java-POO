public class BrownieDoceDeLeite extends Brownie {

    public BrownieDoceDeLeite(String nome, double preco, String sabor)
    {
        super(nome, preco, sabor);
    }

    public void adicionaDoceDeLeite(){
        System.out.println(super.nome + "adicionando doce de leite");
    }

}
