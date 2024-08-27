public class Assassino extends Personagem implements LutarComArmas {
    private Arma arma = new Arma();

    public Assassino(int vida, int energia, int poder, String nome, Arma arma) {
        super(vida, energia, poder, nome);
        setArma(arma);
    }

    public void setArma(Arma arma){
        this.arma = arma;
    }

    @Override
    public void atacar(Personagem alvo) {
        int vidaresultante;
        vidaresultante = alvo.getVida() - arma.getDano()*2;
        alvo.setVida(vidaresultante);
    }
}
