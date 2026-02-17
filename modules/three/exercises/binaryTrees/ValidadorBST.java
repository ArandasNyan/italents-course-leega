package modules.three.exercises.binaryTrees;

// 2 - Validação de BST:
// Escreva um método para verificar se uma árvore binária é uma árvore binária de busca (BST)

public class ValidadorBST {
  Node root;

  // Método principal de validação
  public boolean isValidBST() {
      // Usamos Long para evitar problemas com o valor máximo de Integer
      return checkLimits(root, Long.MIN_VALUE, Long.MAX_VALUE);
  }

  // A lógica recursiva com "Chão" (min) e "Teto" (max)
  private boolean checkLimits(Node node, long min, long max) {
      // Se o nó é nulo, chegamos ao fim de um galho com sucesso
      if (node == null) {
          return true;
      }

      // SE o valor atual fura o chão OU fura o teto, a árvore é inválida
      if (node.value <= min || node.value >= max) {
          System.out.println("  > Erro detectado no nó: " + node.value + 
                             " (Devia estar entre " + min + " e " + max + ")");
          return false;
      }

      // Recursão: 
      // Esquerda: teto vira o valor atual
      // Direita: chão vira o valor atual
      return checkLimits(node.left, min, node.value) && 
             checkLimits(node.right, node.value, max);
  }

  public static void main(String[] args) {
      ValidadorBST arvore = new ValidadorBST();

      // --- TESTE 1: Árvore Válida ---
      //      20
      //     /  \
      //    10   30
      arvore.root = new Node(20);
      arvore.root.left = new Node(10);
      arvore.root.right = new Node(30);

      System.out.println("Teste 1 (Válida): " + arvore.isValidBST());

      // --- TESTE 2: Árvore Inválida ---
      //      20
      //     /  \
      //    10   30
      //        /
      //       15  <-- Erro! 15 é menor que 20 (raiz), mas está na direita.
      arvore.root.right.left = new Node(15);

      System.out.println("Teste 2 (Inválida): " + arvore.isValidBST());
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