public class Main {
    public static void main(String[] args) {
        ThreadFatorial threadFatorial = new ThreadFatorial(10);
        ThreadTempo threadTempo = new ThreadTempo(3);
        ThreadAreaHexagono threadAreaHexagono = new ThreadAreaHexagono(5.0);

        threadFatorial.start();
        threadTempo.start();
        threadAreaHexagono.start();
    }
}