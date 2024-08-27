public class Critico {

    public void lerLivro(Livro livro){
        ThreadLeitura leitura = new ThreadLeitura();
        leitura.setLivro(livro);
        leitura.run();

    }



}
