package modules.three.lessons.binaryTree;

public class BinaryTreeExample {
  Node root;

  public BinaryTreeExample() {
    root = null;
  }

  static class Node {
    String nome;
    Node left, right;

    // crio uma nomenclatura ao nó e permito as ramificações binárias direita e esquerda
    public Node(String nome) {
      this.nome = nome;
      this.left = null;
      this.right = null;
    }
  }

  public static void main(String[] args) {
    BinaryTreeExample arvore = new BinaryTreeExample();

    // posso ramificar cada nó
    arvore.root = new Node("AAA");
    arvore.root.right = new Node("BBB");
    arvore.root.left = new Node("CCC");
    // raiz -> left > right
    arvore.root.left.right = new Node("AAA");

    System.out.println(arvore.root.nome);
    System.out.println(arvore.root.right);
    System.out.println(arvore.root.left.nome);
    // crio uma nova ramificação no lado esquerdo da raiz ramificando a direita
    System.out.println(arvore.root.left.right.nome);
  }
}
