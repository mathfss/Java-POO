public class Mago extends Personagem {
    int poderr;
    public Mago(int vida, int energia, int poder, String nome){
        super(vida, energia, poder, nome);
        poderr = poder;
    }

    public void usarHabilidade(){
        setPoder(poderr - 15);
    }
}
