public class Banda {

    private Musica[] musicas = new Musica[10];
    private int numeroDeIntegrantes;
    private String nome;


    public void adicionarMusica(Musica musica) {
        for(int i=0; i < musicas.length; i++) {
            if (musicas[i] == null){
                this.musicas[i] = musica;
                break;}
        }
    }



    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void tocarMusica(int posicao) {
        if (musicas[posicao] != null)
        {
            System.out.println("Nome: ");
            System.out.print(musicas[posicao].getNome());
            System.out.println("Album: ");
            System.out.print(musicas[posicao].getAlbum());
        }

    }

    public void tocarShow(){
        for(int i=0; i < musicas.length; i++) {
            if (musicas[i] != null){
                tocarMusica(i);
                }
        }
    }
    public void deletarMusica (String nome){
        for(int i=0; i < musicas.length; i++) {
            if (musicas[i] != null) {
                if (musicas[i].getNome().equals(nome)){
                    musicas[i] = null;
                }
            }
        }
    }

    public void Banda(String nome, int numeroDeIntegrantes){

    }
}
