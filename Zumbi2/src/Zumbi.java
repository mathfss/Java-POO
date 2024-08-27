public class Zumbi {

    double vida;
    String nome;

    void mostraVida(double vida) {

    }

    boolean transfereVida(Zumbi zumbiAlvo, double quantia) {


        if (vida >= quantia) {
            vida -= quantia;
            zumbiAlvo.vida += quantia;
            return true;
        }

        return false;


    }


}
