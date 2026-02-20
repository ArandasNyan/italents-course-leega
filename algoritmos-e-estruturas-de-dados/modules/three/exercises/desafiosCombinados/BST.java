package modules.three.exercises.desafiosCombinados;

// 8 - Mínimo de uma BST:
// Escreva um método para encontrar o menor valor em uma árvore binária de busca

public class BST {
  Node root;

  // Método para encontrar o menor valor
  public int encontrarMinimo() {
    if (root == null) {
      System.out.println("A árvore está vazia.");
      return -1; // Ou lançar uma exceção
    }

    Node atual = root;

    // para encontrar o menor valor pela lógica, é somente seguir
    // todos os nós da esquerda caso existam
    while (atual.left != null) {
      atual = atual.left;
    }

    return atual.value;
  }

  public static void main(String[] args) {
    BST arvore = new BST();

    arvore.root = new Node(20);
    arvore.root.left = new Node(10);
    arvore.root.right = new Node(30);
    arvore.root.left.left = new Node(5);
    arvore.root.left.right = new Node(15);

    int min = arvore.encontrarMinimo();
    System.out.println("O menor valor da árvore é: " + min);
  }
}

class Node {
  int value;
  Node left, right;

  Node(int item) {
    value = item;
    left = right = null;
  }
}