public class Peixe extends Animal {

  public Peixe(String nome, int idade) {
      super(nome, idade);
  }

  @Override
  public void emitirSom() {
      System.out.println("O peixe não faz som audível.");
  }
}