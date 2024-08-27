public class Equipe {
    private Carro carro;
    private Piloto[] pilotos = new Piloto[4];
    private Piloto pilotoAtual = new Piloto();
    private String nome;

    private boolean trocarPilotoAtual (int pilotoId)
    {
        for (int i = 0; i < pilotos.length; i++) {
            if (pilotos[i] == pilotoId) {
                pilotoAtual = pilotos[i];
                return true;
            }
        }
        return false;
    }

    private boolean trocarPneu(int tipoDePneu)
    {
        if (1 <= tipoDePneu && tipoDePneu <= 5) {
            carro.setTipoDePneu(tipoDePneu);
            return true;
        }
        else
            return false;
    }

    public void pitStop (int tipoDePneu, int pilotoId)
    {
        trocarPneu(tipoDePneu);
        trocarPilotoAtual(pilotoId);
        if (trocarPilotoAtual(pilotoId) == true && trocarPneu(tipoDePneu) == true)
            System.out.println("A Operação foi um Sucesso!");
    }

    public boolean adicionarPiloto (Piloto piloto)
    {
        for (int i = 0; i < pilotos.length ; i++) {
            if (pilotos[i] == null) {
                pilotos[i] = piloto;
                piloto.setId(i);
                return true;
            }
        }
        return false;
    }

    public boolean retirarPiloto (int pilotoId)
    {
        if (pilotos[pilotoId] != null){
            pilotos[pilotoId] = null;
            return true;
        }
        else
            return false;
    }

    Equipe (String nome)
    {

    }
    public void controiCarro(int tipoDePneu, int potencia, boolean turbo)
    {
        carro = new Carro(tipoDePneu, potencia, turbo);
    }

}
