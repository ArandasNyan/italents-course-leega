public class Animal {

  protected String nome;
  protected int idade;

  // Construtor
  public Animal(String nome, int idade) {
      this.nome = nome;
      this.idade = idade;
  }

  // Método comum a todos os animais
  public void emitirSom() {
      System.out.println("O animal faz um som.");
  }
}