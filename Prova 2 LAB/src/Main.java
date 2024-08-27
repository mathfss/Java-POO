public class Main {
    public static void main(String[] args) {

        Livraria livraria = new Livraria();
        Critico arnaldo = new Critico();

        Livro l1 = new Livro();
        Livro l2= new Livro();
        Livro l3 = new Livro();
        Livro l4 = new Livro();

        l1.setNome("Zoo Friends");
        l1.setPaginas(300);

        l2.setNome("Dinamica mortal");
        l2.setPaginas(500);

        l3.setNome("Ate mais");
        l3.setPaginas(200);

        l4.setNome("Ta Errado");
        l4.setPaginas(-10);

        livraria.adicionarLivro(l1);
        livraria.adicionarLivro(l2);
        livraria.adicionarLivro(l3);
        livraria.adicionarLivro(l4);

        arnaldo.lerLivro(l2);

        livraria.avaliacaoDeLivro(0);

        livraria.ordenarLivros();

        livraria.buscarLivro(0);
        livraria.buscarLivro(1);
        livraria.buscarLivro(2);

        livraria.deletarLivro(2);


        livraria.buscarLivro(2);

        Livro l5 = new Livro();
        l5.setNome("Seila");
        l5.setPaginas(320);
        livraria.atualizarEstoque(l5);

    }
}