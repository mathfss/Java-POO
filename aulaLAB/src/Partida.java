public class Partida {

    Jogador[] array = new Jogador[10];

    boolean adicionarJogadorNaLista(Jogador selecionado)
    {
        for (int i=0; i < array.length; i++){
            if (array[i] == null) {
                array[i] = selecionado;
                return true;
            }
        }
        return false;
    }

    void lutaDeJogadores(int posicao1 , int posicao2)
    {
        array[posicao1].atacar(array[posicao2]);
        array[posicao2].atacar(array[posicao1]);
    }

    void listarJogadoresEArmas(){
        for (int i=0; i < array.length; i++)
        {
            if (array[i] != null)
                System.out.println(array[i]);
        }
    }

}
