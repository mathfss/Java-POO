public class Casa {

    public String endereco;
    Quarto[] quartos = new Quarto[50];
    public String cor;

    public Casa(String endereco, String cor, Quarto[] quartos) {
        this.endereco = endereco;
        this.cor = cor;
        this.quartos = quartos;
    }

    public void mostraInfo(){
        System.out.println("Endereço: " + endereco);
        System.out.println("Cor: " + cor);
        for (int i = 0; i < quartos.length; i++) {
            if (quartos[i] != null)
                System.out.println(quartos[i].getNumeroDeJanelas());
            else
                break;
        }
    }

    public void mostraQuartos(){
        for (int i = 0; i < quartos.length; i++) {
            if(quartos[i] != null)
                System.out.println(quartos[i].getNumeroDeJanelas());
            else
                break;
        }

    }

    public boolean constroiQuarto(Quarto quarto, int n){
        if (quartos[n] == null){
            quartos[n] = quarto;
            return true;
        }
        else
            return false;
    }

    public float CalculaAreaTotalDaCasa(){
        float area = quartos[0].getArea();
        for (int i = 0; i < quartos.length; i++) {
            if (quartos[i] != null && quartos[i+1] != null)
            {
                area = area + quartos[i+1].getArea();
            }
            else
                break;
        }
        return area;
    }


}
