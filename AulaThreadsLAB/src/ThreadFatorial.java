public class ThreadFatorial extends Thread {
    private int numero;

    public ThreadFatorial(int numero) {
        this.numero = numero;
    }

    @Override
    public void run() {
        long resultado = calcularFatorial(numero);
        System.out.println("Fatorial: " + resultado);
    }

    public long calcularFatorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * calcularFatorial(n - 1);
        }
    }
}
