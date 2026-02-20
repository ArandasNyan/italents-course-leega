package exercises;

import java.util.ArrayList;
import java.util.Scanner;

// POO
// • Crie uma classe Pessoa com atributos como nome, idade e endereço. Implemente um
//  programa que permite ao usuário criar e gerenciar uma lista de pessoas.

public class ExerciseNine {

    public static void main(String[] args) {
        // Scanner para entrada de dados do usuário
        Scanner scanner = new Scanner(System.in);

        // Lista que armazenará todos os objetos Pessoa criados
        ArrayList<Pessoa> listaDePessoas = new ArrayList<>();

        int opcao;

        // Executa enquanto uma condição não é atingida
        // mostra menu e aguarda informações do usuário
        do {
            System.out.println("\n--- GERENCIADOR DE PESSOAS ---");
            System.out.println("1 - Adicionar Pessoa");
            System.out.println("2 - Remover Pessoa (por ID)");
            System.out.println("3 - Atualizar Pessoa (por ID)");
            System.out.println("4 - Mostrar Lista");
            System.out.println("0 - Sair");

            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // limpa quebra de linha pendente do teclado

            // Direciona a execução conforme a opção escolhida
            switch (opcao) {
                case 1:
                    adicionarPessoa(scanner, listaDePessoas);
                    break;
                case 2:
                    removerPessoa(scanner, listaDePessoas);
                    break;
                case 3:
                    atualizarPessoa(scanner, listaDePessoas);
                    break;
                case 4:
                    mostrarLista(listaDePessoas);
                    break;
                case 0:
                    System.out.println("Aplicação encerrada!");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 0);

        scanner.close();
    }

    // métodos para gerenciar a lista de pessoas

    public static void adicionarPessoa(Scanner sc, ArrayList<Pessoa> lista) {
        // Coleta os dados necessários para criar uma nova pessoa
        System.out.print("Nome: ");
        String nome = sc.nextLine();

        System.out.print("Idade: ");
        int idade = sc.nextInt();
        sc.nextLine();

        System.out.print("Endereço: ");
        String endereco = sc.nextLine();

        // Cria um novo objeto Pessoa e adiciona à lista
        lista.add(new Pessoa(nome, idade, endereco));

        System.out.println("Pessoa adicionada com sucesso!");
    }

    public static void mostrarLista(ArrayList<Pessoa> lista) {
        // Verifica se há pessoas cadastradas
        if (lista.isEmpty()) {
            System.out.println("A lista está vazia.");
            return;
        }

        // Percorre a lista e exibe os dados de cada objeto Pessoa
        for (Pessoa pessoa : lista) {
            System.out.println("ID: " + pessoa.id +
                    " | Nome: " + pessoa.nome +
                    " | Idade: " + pessoa.idade +
                    " | End: " + pessoa.endereco);
        }
    }

    public static void removerPessoa(Scanner sc, ArrayList<Pessoa> lista) {
        // Solicita o ID da pessoa que será removida
        System.out.print("Digite o ID da pessoa a remover: ");
        int idProcurado = sc.nextInt();

        // Remove da lista a pessoa cujo ID corresponde ao informado
        boolean removido = lista.removeIf(pessoa -> pessoa.id == idProcurado);

        // Informa se a remoção foi realizada ou não
        if (removido) {
            System.out.println("Pessoa removida!");
        } else {
            System.out.println("ID não encontrado.");
        }
    }

    public static void atualizarPessoa(Scanner sc, ArrayList<Pessoa> lista) {
        // Solicita o ID da pessoa que será atualizada
        System.out.print("Digite o ID da pessoa a atualizar: ");
        int idProcurado = sc.nextInt();
        sc.nextLine();

        // Procura na lista a pessoa correspondente
        for (Pessoa pessoa : lista) {
            if (pessoa.id == idProcurado) {
                // Permite atualizar nome (ou manter o atual)
                System.out.print("Novo nome (deixe vazio para manter [" + pessoa.nome + "]): ");
                String novoNome = sc.nextLine();
                if (!novoNome.isEmpty()) pessoa.nome = novoNome;

                // Permite atualizar idade (0 mantém o valor atual)
                System.out.print("Nova idade (digite 0 para manter [" + pessoa.idade + "]): ");
                int novaIdade = sc.nextInt();
                sc.nextLine();
                if (novaIdade != 0) pessoa.idade = novaIdade;

                // Permite atualizar endereço (ou manter o atual)
                System.out.print("Novo endereço (deixe vazio para manter [" + pessoa.endereco + "]): ");
                String novoEnd = sc.nextLine();
                if (!novoEnd.isEmpty()) pessoa.endereco = novoEnd;

                System.out.println("Dados atualizados!");
                return;
            }
        }

        // Caso o ID não exista na lista
        System.out.println("ID não encontrado.");
    }
}

// Utilização de classe pessoa
class Pessoa {
    // Controla automaticamente a geração de IDs únicos
    static int contador = 1;

    int id;
    String nome;
    int idade;
    String endereco;

    Pessoa(String nome, int idade, String endereco) {

        // Cada nova pessoa recebe um ID automático e único
        this.id = contador;
        contador++;

        // Atribui os valores recebidos aos atributos do objeto
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
    }
}