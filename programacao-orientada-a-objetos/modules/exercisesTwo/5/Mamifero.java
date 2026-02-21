public class Mamifero extends Animal {

  public Mamifero(String nome, int idade) {
      super(nome, idade); // chama o construtor da classe Animal
  }

  @Override
  public void emitirSom() {
      System.out.println("O mamífero emite um som.");
  }
}