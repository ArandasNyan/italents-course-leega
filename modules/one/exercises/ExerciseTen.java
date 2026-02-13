package exercises;

import java.util.ArrayList;
import java.util.Scanner;

// Exercício 10: Desafio Final
// • Implemente um sistema de gerenciamento de estoque para uma loja, permitindo ao usuário
// adicionar, remover e atualizar itens no estoque. Utilize classes, listas e estruturas
// condicionais.

public class ExerciseTen {
    // int[] novoEstoque = new int[127];
    // double[] estoqueNovo = new double[12950];
    static ArrayList<Produto> estoque = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        // Roda o menu até que o usuário indique pra sair (0).
        do {
            System.out.println("\n===== SISTEMA DE ESTOQUE LOJA =====");
            System.out.println("1 - Adicionar Novo Produto");
            System.out.println("2 - Listar Estoque Completo");
            System.out.println("3 - Atualizar Preço ou Quantidade");
            System.out.println("4 - Remover Produto");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1 -> adicionarItem(scanner);
                case 2 -> listarEstoque();
                case 3 -> atualizarItem(scanner);
                case 4 -> removerItem(scanner);
                case 0 -> System.out.println("Sistema encerrado.");
                default -> System.out.println("Opção inválida!");
            }

        } while (opcao != 0);

        scanner.close();
    }

    public static void adicionarItem(Scanner sc) {
        System.out.print("Nome do Produto: ");
        String nome = sc.nextLine();

        System.out.print("Quantidade Inicial: ");
        int qtd = sc.nextInt();

        System.out.print("Preço Unitário: ");
        double preco = sc.nextDouble();

        // Inicia uma estancia e acrescenta ela na lista
        estoque.add(new Produto(nome, qtd, preco));

        System.out.println("Produto cadastrado com sucesso!");
    }

    public static void listarEstoque() {
        if (estoque.isEmpty()) {
            System.out.println("Estoque vazio.");
            return;
        }

        System.out.println("\n-------------------------------------------");

        for (Produto produto : estoque) {
            // Se tiver menos de 5, já deixa um aviso de reposição na tela.
            String alerta = (produto.quantidade < 5) ? " [REPOR ESTOQUE!]" : "";

            System.out.printf("ID: %d | Item: %-15s | Qtd: %d | Preço: R$ %.2f%s%n",
                    produto.id, produto.nome, produto.quantidade, produto.preco, alerta);
        }

        System.out.println("-------------------------------------------");
    }

    public static void atualizarItem(Scanner sc) {
        System.out.print("Informe o ID do produto: ");
        int idAlvo = sc.nextInt();

        // Percorre a lista pra achar o ID que o cara digitou.
        for (Produto produto : estoque) {
            if (produto.id == idAlvo) {
                System.out.println("Produto encontrado: " + produto.nome);

                // Se digitar -1, a gente ignora a mudança e mantém o que já estava.
                System.out.print("Nova Quantidade (ou -1 para manter): ");
                int novaQtd = sc.nextInt();
                if (novaQtd != -1)
                    produto.quantidade = novaQtd;

                System.out.print("Novo Preço (ou -1 para manter): ");
                double novoPreco = sc.nextDouble();
                if (novoPreco != -1)
                    produto.preco = novoPreco;

                System.out.println("Dados atualizados!");
                return;
            }
        }

        System.out.println("Produto não encontrado.");
    }

    public static void removerItem(Scanner sc) {
        System.out.print("ID para remover: ");
        int idAlvo = sc.nextInt();

        // Uso o for indexado (i) porque fica mais fácil de remover pelo índice.
        for (int i = 0; i < estoque.size(); i++) {
            if (estoque.get(i).id == idAlvo) {
                estoque.remove(i);
                System.out.println("Produto removido do sistema.");
                return;
            }
        }

        System.out.println("ID inexistente.");
    }
}

class Produto {
    // Contador estático pra garantir que cada produto tenha um ID único automático.
    static int contador = 1;

    int id;
    String nome;
    int quantidade;
    double preco;

    Produto(String nome, int quantidade, double preco) {
        this.id = contador++;
        // contador++;
        this.nome = nome;
        // Garante que o estoque nunca comece com número negativo.
        this.quantidade = Math.max(0, quantidade);
        this.preco = preco;
    }
}