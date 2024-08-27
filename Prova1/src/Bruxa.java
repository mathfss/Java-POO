public class Bruxa extends Monstro {
    private Feitico[] feiticos = new Feitico[50];
    public Bruxa(int idade, int vida, int energia, Feitico[] feiticos){
        super(idade, vida, energia);
    }

    public void aprenderFeitico(Feitico feitico){
        for (int i = 0; i < feiticos.length; i++) {
            if(feiticos[i] == null){
                feiticos[i] = feitico;
                break;
            }
        }
    }

    public void listarFeiticos(){
        for (int i = 0; i < feiticos.length; i++) {
            if (feiticos[i] == null){
            }
            else {
                System.out.println("Nome: " + feiticos[i].getNome());
                System.out.println("Poder: " + feiticos[i].getPoder());
            }
        }
    }

    public void esquecerFeitico(int posicao){
        feiticos[posicao] = null;
    }

    public void lancarFeitico(Monstro monstroAlvo, int posicao){
        setEnergia((getEnergia()) - (feiticos[posicao].getPoder()));
        monstroAlvo.setVida((getVida()) - (feiticos[posicao].getPoder()));
    }
}
