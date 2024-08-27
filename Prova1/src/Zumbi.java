public class Zumbi extends Monstro implements Mordida {
    private int numeroDeCerebrosComidos;

    public Zumbi(int idade, int vida, int energia, int numeroDeCerebrosComidos){
        super(idade, vida, energia);
    }

    public int getNumeroDeCerebrosComidos(){
        return this.numeroDeCerebrosComidos;
    }

    @Override
    public void atacarComMordida(Monstro monstroAlvo) {
        if(getEnergia() >= 2){
            monstroAlvo.setVida((monstroAlvo.getVida()) - 3);
            this.numeroDeCerebrosComidos += 1;
            setEnergia((getEnergia() - 2));
        }
        else
            System.out.println("Nao foi possivel realizar o ataque");
    }
}
