public class Main {
    public static void main(String[] args) {
        Feitico[] feiticos = new Feitico[50];
        Bruxa bruxa = new Bruxa(45, 30, 20, feiticos);
        Vampiro vampiro = new Vampiro(25, 40, 30, 10, false);
        Zumbi zumbi = new Zumbi(100, 50, 25, 80);

        Feitico Lentidao = new Feitico("Lentidao", 10);
        Feitico Venenoso = new Feitico("Venenoso", 15);
        Feitico InstaDano = new Feitico("InstaDano", 20);
        Feitico Hipnose = new Feitico("Hipnose", 25);

        zumbi.atacarComMordida(vampiro);
        System.out.println(vampiro.getVida());
        System.out.println(zumbi.getNumeroDeCerebrosComidos());
        System.out.println(zumbi.getEnergia());
        zumbi.assustar(vampiro);
        System.out.println(vampiro.getEnergia());

        vampiro.atacarComMordida(zumbi);
        System.out.println(zumbi.getVida());
        System.out.println(vampiro.getMedidorDeSangue());
        System.out.println(vampiro.getEnergia());
        vampiro.recuperarVida();
        System.out.println(vampiro.getVida());
        vampiro.transformar();
        System.out.println(vampiro.getFormaDeMorcego());

        bruxa.aprenderFeitico(Lentidao);
        bruxa.aprenderFeitico(Venenoso);
        bruxa.aprenderFeitico(InstaDano);
        bruxa.aprenderFeitico(Hipnose);
        bruxa.esquecerFeitico(1);
        bruxa.listarFeiticos();
        bruxa.lancarFeitico(zumbi, 0);
        System.out.println(zumbi.getVida());


    }
}