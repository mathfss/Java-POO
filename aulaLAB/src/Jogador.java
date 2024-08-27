public class Jogador {

    Arma arma = new Arma();
    int energia;
    int vida;

    void atacar(Jogador alvo){
        alvo.vida -= 10;
    }

    Jogador(){
    }

    Jogador(Arma arma, int energia, int vida){

    }

    @Override
    public String toString() {
        return "vida: " + this.vida;
        return "arma: " + this.arma;
    }
}
