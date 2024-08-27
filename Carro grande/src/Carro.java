public class Carro {
    private Motor motor = new Motor();
    private int tipoDePneu;

    public void correr() {

    }

    public void setTipoDePneu(int tipoDePneu)
    {
        this.tipoDePneu = tipoDePneu;
    }
    Carro (int tipoDePneu, int potencia, boolean turbo)
    {
        this.tipoDePneu = tipoDePneu;
        motor.setPotencia(potencia);
        motor.setTurbo(turbo);
    }
}
