public class Ave extends Animal {

  public Ave(String nome, int idade) {
      super(nome, idade);
  }

  @Override
  public void emitirSom() {
      System.out.println("A ave canta.");
  }
}