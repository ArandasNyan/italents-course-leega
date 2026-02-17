package modules.three.lessons.BST;

// ordenação traversal permita a correção e ajuste ordenado dos itens

public class BinarySearchTree {
  Node root;

  BinarySearchTree() {
    root = null;
  }

  public static void main(String[] args) {
    BinarySearchTree tree = new BinarySearchTree();

    tree.insert(20);
    tree.insert(30);
    tree.insert(10);
    tree.insert(40);
    tree.insert(42);
    tree.insert(7);

    System.out.println("Arvore ordenada: ");
    tree.inOrderTraversal();

    if(tree.search(42)) {
      System.out.println("Chave encontrada!");
    } else {
      System.out.println("Chave não encontrada!");
    }
  }

  void inOrderTraversal() {
    inOrderTraversalRecursive(root);
  }

  void inOrderTraversalRecursive(Node root) {
    if (root != null) {
      // se inverter a ordem esquerda para a direita
      inOrderTraversalRecursive(root.left); // right
      System.out.print(root.key + " ");
      inOrderTraversalRecursive(root.right); // left
      // ele fará o caminho inverso
    }
  }

  boolean search(int key) {
    return searchRecursive(root, key);
  }

  boolean searchRecursive(Node root, int key) {
    // se root for null ele não encontra
    if (root == null)
      return false;
    // se chave for igual chave ele determina encontrado
    if (root.key == key)
      return true;

    // se a chave for menor ele buscará de forma recursiva nas ramificações
    if (key < root.key) {
      return searchRecursive(root.left, key);
    } else {
      return searchRecursive(root.right, key);
    }
  }

  void insert(int key) {
    root = recursiveInsert(root, key);
  }

  Node recursiveInsert(Node root, int key) {
    if (root == null) {
      root = new Node(key);
      return root;
    }

    // left node
    if (key < root.key) {
      // recursive action
      root.left = recursiveInsert(root.left, key);
      // right node
    } else if (key > root.key) {
      root.right = recursiveInsert(root.right, key);
    }

    return root;
  }
}

class Node {
  int key;
  Node left, right;

  public Node(int item) {
    key = item;
    left = right = null;
  }
}