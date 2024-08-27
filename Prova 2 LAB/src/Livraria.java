import java.util.ArrayList;
import java.util.Collections;

public class Livraria {

    private ArrayList<Livro> estoque = new ArrayList<>();
    private Critico critico = new Critico();

    public void ordenarLivros(){
        Collections.sort(estoque);
    }

    public void adicionarLivro(Livro livro){
        estoque.add(livro);
    }

    public void deletarLivro(int index){
        estoque.remove(index);
    }

    public void atualizarEstoque(Livro livro){
        int index = estoque.indexOf(livro);
        estoque.set(index, livro);
    }

    public void avaliacaoDeLivro(int index){
        System.out.println("Avaliando livro: " + estoque.get(index).getNome());
    }

    public void buscarLivro(int index) {
        System.out.println(estoque.get(index).getNome());
    }

}
