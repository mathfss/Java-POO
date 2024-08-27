public class Vampiro extends Monstro implements Mordida {
    private int medidorDeSangue;
    private boolean formaDeMorcego;

    public Vampiro(int idade, int vida, int energia, int medidorDeSangue, boolean formaDeMorcego){
        super(idade, vida, energia);
    }

    public int getMedidorDeSangue(){
        return this.medidorDeSangue;
    }
    public boolean getFormaDeMorcego(){
        return this.formaDeMorcego;
    }

    public void transformar(){
        if(this.formaDeMorcego == false){
            this.formaDeMorcego = true;
        }
        else {
            this.formaDeMorcego = false;
        }
    }

    public void recuperarVida(){
        setVida(this.medidorDeSangue);
        this.medidorDeSangue = 0;
    }

    @Override
    public void atacarComMordida(Monstro monstroAlvo) {

        if(getEnergia() >= 2){
            monstroAlvo.setVida((monstroAlvo.getVida()) - 2);
            this.medidorDeSangue += 1;
            setEnergia((getEnergia()) - 2);
        }
        else
            System.out.println("Nao foi possivel realizar o ataque");
    }
}
