import java.util.concurrent.TimeUnit;

public class ThreadLeitura extends Thread {

    private Livro livro = new Livro();

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public void run(){
        int x;
        x = (livro.getPaginas()/100);

        try {
            TimeUnit.SECONDS.sleep(x);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        int max = 10;
        int min = 1;

        int range = max - min + 1;
        int rand = (int) (Math.random() * range) + min;

        System.out.println("Nota do livro: " + rand);
    }

}
