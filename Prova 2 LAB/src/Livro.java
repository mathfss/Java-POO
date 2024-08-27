public class Livro implements Comparable<Livro> {

    private int paginas;
    private String nome;
    private int nota;

    public int compareTo(Livro livro) {
        return this.nome.compareTo(livro.nome);
    }


    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        try {
            if (paginas < 0) {
                throw new LivroInvalidoException("Erro: numero de paginas negativo");
            }
            this.paginas = paginas;
        } catch (LivroInvalidoException e) {
            System.out.println(e.getMessage());
        }
    }


    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
