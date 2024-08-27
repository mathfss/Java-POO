public class Main {
    public static void main(String[] args) {

        Personagem jaspion = new Personagem();
        Personagem ale = new Personagem();

        jaspion.pontos = 20;
        ale.pontos = 15;

        Arma glock = new Arma();
        Arma tec9 = new Arma();

        glock.poder = 50;
        tec9.poder = 100;

        glock.resistencia = 90;
        tec9.resistencia = 40;

        glock.descricao = "Pistola modo padrão/rajada";
        tec9.descricao = "Pistola automática";

        glock.mostraInfoArma();
        tec9.mostraInfoArma();

        jaspion.arma = glock;
        ale.arma = tec9;

        jaspion.usarArma();
        ale.usarArma();

        glock.mostraInfoArma();
        tec9.mostraInfoArma();

        jaspion.tomarDano();
        ale.tomarDano();
        ale.tomarDano();

        System.out.println(jaspion.pontos);
        System.out.println(ale.pontos);

    }
}