public class Personagem {

    private int vida;
    private int energia;
    private int poder;
    private String nome;

    public Personagem(int vida, int energia, int poder, String nome)
    {
        this.vida = vida;
        this.energia = energia;
        this.poder = poder;
        this.nome = nome;
    }
    public void usarHabilidade(){
        this.energia = energia - 15;
    }

    public void setPoder(int poder){
        this.poder = poder;
    }
    public void setVida(int vida){
        this.vida = vida;
    }
    public int getVida(){
        return this.vida;
    }

    public void setEnergia(int energia){
        this.energia = energia;
    }

    public int getEnergia(){
        return this.energia;
    }

    public int getPoder(){
        return this.poder;
    }
}
