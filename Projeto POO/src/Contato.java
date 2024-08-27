import java.io.Serializable;

// aqui ele implementa a interface Serializable pra ele serializar os objetos
// isso preserva bastante a persistência dos dados armazenados
// e consequentemente ja usa um conceito de orientacao a objeto q é a implementação
public class Contato implements Serializable {
    private static final long serialVersionUID = 1L;

    private String nome;
    // aqui podemos ver 2 atributos nome e telefone q sao dados como private
    // oq ja utiliza de mais um conceito de orientacao a objeto q é o encapsulamento
    private String telefone;

    public Contato(String nome, String telefone) { // aqui é o construtor
        this.nome = nome;
        this.telefone = telefone;
    }

    // e os getters e setters pra fzr o acesso e a modificação dos dados
    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    // aq eu usei o toString ne
    @Override
    public String toString() {
        return "Nome: " + nome + ", Telefone: " + telefone;
    }
}