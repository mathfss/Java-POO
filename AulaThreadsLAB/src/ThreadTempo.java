public class ThreadTempo extends Thread {
    private int segundos;

    public ThreadTempo(int segundos) {
        this.segundos = segundos;
    }

    @Override
    public void run() {
        long ti = System.currentTimeMillis();
        try {
            Thread.sleep(segundos * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        long tf = System.currentTimeMillis();
        double tempo = (tf - ti) / 1000.0;
        System.out.println("Tempo: " + tempo);
    }
}
