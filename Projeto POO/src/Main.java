import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // aqui a gente cria um gerenciador pra armazenar os contatos em um arquivo .dat
        GerenciadorContatos gerenciador = new GerenciadorContatos("contatos.dat");
        // aqui é o scanner que a gente vai usar pra receber as entradas do usuario ne
        Scanner scanner = new Scanner(System.in);


        // aqui é a interface via terminal que a gente da 6 opções pro usuario
        // adicionar listar buscar atualizar remover e sair
        // utilizando um dowhile e um switch pra repetição pro usuario conseguir fazer
        // varias ações
        int opcao;
        do {
            System.out.println("----- Menu -----");
            System.out.println("1. Adicionar Contato");
            System.out.println("2. Listar Contatos");
            System.out.println("3. Buscar Contato");
            System.out.println("4. Atualizar Contato");
            System.out.println("5. Remover Contato");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Nome do contato: ");
                    String nome = scanner.nextLine();
                    System.out.print("Telefone do contato: ");
                    String telefone = scanner.nextLine();
                    gerenciador.adicionarContato(new Contato(nome, telefone));
                    break;
                case 2:
                    gerenciador.listarContatos();
                    break;
                case 3:
                    System.out.print("Digite o nome do contato: ");
                    String nomeBusca = scanner.nextLine();
                    Contato contatoEncontrado = gerenciador.buscarContato(nomeBusca);
                    if (contatoEncontrado != null) {
                        System.out.println("Contato encontrado: " + contatoEncontrado);
                    } else {
                        System.out.println("Contato não encontrado.");
                    }
                    break;
                case 4:
                    System.out.print("Digite o nome do contato que deseja atualizar: ");
                    String nomeAtualizar = scanner.nextLine();
                    System.out.print("Novo telefone: ");
                    String novoTelefone = scanner.nextLine();
                    gerenciador.atualizarContato(nomeAtualizar, novoTelefone);
                    break;
                case 5:
                    System.out.print("Digite o nome do contato que deseja remover: ");
                    String nomeRemover = scanner.nextLine();
                    gerenciador.removerContato(nomeRemover);
                    break;
                case 0:
                    System.out.println("Saindo do programa. Até mais!");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

        } while (opcao != 0);
        // aqui o looping quebra com o 0 da opção sair e encerra o programa

        scanner.close();
    }
}