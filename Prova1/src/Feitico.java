public class Feitico {
    private String nome;
    private int poder;

    public Feitico(String nome, int poder){
        this.nome = nome;
        this.poder = poder;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setPoder(int poder){
        this.poder = poder;
    }

    public int getPoder(){
        return this.poder;
    }

    public String getNome(){
        return this.nome;
    }
}
