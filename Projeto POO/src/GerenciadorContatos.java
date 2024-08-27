import java.io.*;
import java.util.ArrayList;

public class GerenciadorContatos implements AcaoContato {
    // e aqui a no gerenciadorContatos que a interface é implementada
    // utilizando novamente o conceito de implementação
    private ArrayList<Contato> contatos; // aqui um arraylist pra armazenar os contatos
    private String arquivo;

    // aqui a gnt armazena os contatos em um arquivo direto pelo construtor
    public GerenciadorContatos(String arquivo) {
        this.arquivo = arquivo;
        this.contatos = carregarContatos();
    }

    // aqui nessa função a gente carrega os contatos do arquivo
    // e trata todas as exceptions que podem ocorrer
    private ArrayList<Contato> carregarContatos() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(arquivo))) {
            return (ArrayList<Contato>) ois.readObject();
        } catch (FileNotFoundException e) {
            return new ArrayList<>();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }

    // nessa função a gente basicamente salva os contatos no arquivo
    private void salvarContatos() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(arquivo))) {
            oos.writeObject(contatos);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // bom essa função seria o "create" do CRUD ne
    // ela basicamente adiciona o contato criado na lista
    @Override
    public void adicionarContato(Contato contato) {
        contatos.add(contato);
        salvarContatos();
        System.out.println("Contato adicionado com sucesso!");
    }

    // essas duas funções seriam o "read" do CRUD
    // essa função lista todos os contatos armazenados no arquivo
    @Override
    public void listarContatos() {
        for (Contato contato : contatos) {
            System.out.println(contato);
        }
    }

    // e essa função busca algum contato pelo nome que você colocar
    @Override
    public Contato buscarContato(String nome) {
        for (Contato contato : contatos) {
            if (contato.getNome().equalsIgnoreCase(nome)) {
                return contato;
            }
        }
        return null;
    }

    // essa função seria o "update" do CRUD
    // com ela você pode atualizar algum contato alterando o seu numero de telefone
    @Override
    public void atualizarContato(String nome, String novoTelefone) {
        Contato contato = buscarContato(nome);
        if (contato != null) {
            contato.setTelefone(novoTelefone);
            salvarContatos();
            System.out.println("Contato atualizado com sucesso!");
        } else {
            System.out.println("Contato não encontrado.");
        }
    }

    // e por último essa função seria o "delete" do CRUD
    // com ela você deleta algum contato pelo nome dele
    @Override
    public void removerContato(String nome) {
        Contato contato = buscarContato(nome);
        if (contato != null) {
            contatos.remove(contato);
            salvarContatos();
            System.out.println("Contato removido com sucesso!");
        } else {
            System.out.println("Contato não encontrado.");
        }
    }
}