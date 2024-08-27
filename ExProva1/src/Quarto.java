public class Quarto {
    private int numeroDePortas;
    private int numeroDeJanelas;
    private String corDasParedes;
    private float area;

    public void setArea(float n){
        this.area = n;
    }

    public float getArea(){
        return this.area;
    }
    public int getNumeroDePortas(){
        return this.numeroDePortas;
    }
    public int getNumeroDeJanelas(){
        return this.numeroDeJanelas;
    }

    public void setNumeroDeJanelas(int n){
        this.numeroDeJanelas = n;
    }
}
