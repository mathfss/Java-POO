public class Estagiario extends Usuario implements CalculaSalario {
    private int numDeHorasTrabalhadas;

    public Estagiario(int id, int senha, int numDeHorasTrabalhadas) {
        super(id, senha);
        this.numDeHorasTrabalhadas = numDeHorasTrabalhadas;
    }

    @Override
    public float calculaSalario() {return numDeHorasTrabalhadas*2;}
}
