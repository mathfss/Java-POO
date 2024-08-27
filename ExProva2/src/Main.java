public class Main {
    public static void main(String[] args) {
        Arma pistola = new Arma();
        pistola.setNome("Pistola");
        pistola.setDano(20);
        Arma fuzil = new Arma();
        fuzil.setNome("Fuzil");
        fuzil.setDano(50);
        Assassino assassino = new Assassino(50, 100, 488, "carlos", fuzil);
        Guerreiro guerreiro = new Guerreiro(142, 200, 100, "andre", pistola);
        Mago mago = new Mago(90, 200, 300, "alezin");

        guerreiro.usarHabilidade();
        System.out.println(guerreiro.getEnergia());

        mago.usarHabilidade();
        System.out.println(mago.getPoder());

        guerreiro.atacar(assassino);
        System.out.println(assassino.getVida());

        assassino.atacar(guerreiro);
        System.out.println(guerreiro.getVida());
    }
}