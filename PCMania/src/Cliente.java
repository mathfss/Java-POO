public class Cliente {

    String nome;
    long cpf;
    Computador[] computador = new Computador[50];

    public float calculaTotalcompra() {
        float total = 0;
        for (int i = 0; i < computador.length; i++) {
            if (computador[i] != null) {
                total = computador[i].preco + total;
            }
        }
        return total;
    }



}
