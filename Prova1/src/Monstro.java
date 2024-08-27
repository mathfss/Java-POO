public class Monstro {
    private int idade;
    private int vida;
    private int energia;

    public Monstro(int idade, int vida, int energia)
    {
        this.idade = idade;
        this.vida = vida;
        this.energia = energia;
    }

    public void assustar(Monstro monstroAlvo){
        monstroAlvo.energia -= 2;
        this.energia += 2;
    }

    public void setVida(int vida){
        this.vida = vida;
    }

    public int getVida(){
        return this.vida;
    }
    public int getEnergia(){
        return this.energia;
    }
    public void setEnergia(int energia){
        this.energia = energia;
    }
}
