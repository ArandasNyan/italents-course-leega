package modules.three.exercises.binaryTrees;

// 1 - Implementação da Árvore Binária:
// Crie uma classe em Java para representar uma árvore binária e implemente métodos para inserir
// elementos, percorrer a árvore em pré-ordem, pós-ordem e em ordem.

public class BinaryTree {
  Node root;

  public BinaryTree() {
    root = null;
  }

  // Métodos para inserir (começando root e após nó esquerdo e por ultimo nó direito)
  public void insert(int value) {
    root = recursiveInsert(root, value);
  }

  // recursividade para o método insert
  private Node recursiveInsert(Node root, int value) {
    // verifica se a raiz está vazia
    if(root == null) {
      // se estiver então adicionamos um valor
      root = new Node(value);
      return root; // retornamos essa raiz
    }

    // se o valor novo é maior que o valor da raiz
    if (value < root.value) {
      // então adiciono um novo valor ao nó esquerdo da raiz
      root.left = recursiveInsert(root.left, value);
    } else if (value > root.value) {
      // se for maior então eu adiciono ao nó direito da raiz
      root.right = recursiveInsert(root.right, value);
    }

    return root; // retorno minha raiz
  }

  // passará primeiro pela raiz, depois pelo nó esquerdo e por fim pelo nó direito
  public void preOrder(Node node) {
    if(node != null) {
      System.out.println(node.value + " ");
      preOrder(node.left);
      preOrder(node.right);
    }
  }

  // irá percorrer pelo nó esquerda passará pela raiz e por fim o nó direito
  public void inOrder(Node node) {
    if(node != null) {
      inOrder(node.left);
      System.out.println(node.value + " ");
      inOrder(node.right);
    }
  }

  // irá percorrer pelo nó esquerdo passará pelo direito e por fim pela raiz
  public void postOrder(Node node) {
    if(node != null) {
      postOrder(node.left);
      postOrder(node.right);
      System.out.println(node.value + " ");
    }
  }

  public static void main(String[] args) {
    BinaryTree tree = new BinaryTree();

    tree.insert(20);
    tree.insert(10);
    tree.insert(30);
    tree.insert(63);
    tree.insert(44);
    tree.insert(56);
    tree.insert(71);
    tree.insert(90);
    tree.insert(89);

    System.out.println("Exibição preOrder: ");
    tree.preOrder(tree.root);

    System.out.println("Exibição inOrder: ");
    tree.inOrder(tree.root);

    System.out.println("Exibição postOrder: ");
    tree.postOrder(tree.root);
  }

  // molde para criar NÓs e raizes
  private class Node {
    int value;
    Node left, right;
    
    public Node(int item) {
      this.value = item;
      left = null;
      right = null;
    }
  }
}