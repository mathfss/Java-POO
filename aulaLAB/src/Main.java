public class Main {
    public static void main(String[] args) {

        Jogador player1 = new Jogador();
        player1.vida = 20;
        player1.arma.dano = 5;
        player1.arma.custoDeEnergia = 8;
        Jogador player2 = new Jogador();
        player2.vida = 30;
        player1.arma.dano = 10;
        player1.arma.custoDeEnergia = 16;
        Jogador player3 = new Jogador();
        Partida match = new Partida();
        match.adicionarJogadorNaLista(player1);
        match.adicionarJogadorNaLista(player2);
        match.adicionarJogadorNaLista(player3);

        match.lutaDeJogadores(0, 1);

        match.listarJogadoresEArmas();

    }
}