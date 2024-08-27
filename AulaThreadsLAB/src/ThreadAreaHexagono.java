public class ThreadAreaHexagono extends Thread {
    private double comprimentoLado;

    public ThreadAreaHexagono(double comprimentoLado) {
        this.comprimentoLado = comprimentoLado;
    }

    @Override
    public void run() {
        double area = calculaArea(comprimentoLado);
        System.out.println("Área: " + area);
    }

    public double calculaArea(double lado) {
        return (3 * Math.sqrt(3) * Math.pow(lado, 2)) / 2;
    }

}
