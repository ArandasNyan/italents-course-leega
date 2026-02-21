public class Main {

  public static void main(String[] args) {

      // Criando objetos das subclasses
      Animal mamifero = new Mamifero("Cachorro", 5);
      Animal ave = new Ave("Papagaio", 2);
      Animal peixe = new Peixe("Nemo", 1);

      // Testando polimorfismo
      System.out.println("=== Mamífero ===");
      System.out.println("Nome: " + mamifero.nome);
      System.out.println("Idade: " + mamifero.idade);
      mamifero.emitirSom();

      System.out.println("\n=== Ave ===");
      System.out.println("Nome: " + ave.nome);
      System.out.println("Idade: " + ave.idade);
      ave.emitirSom();

      System.out.println("\n=== Peixe ===");
      System.out.println("Nome: " + peixe.nome);
      System.out.println("Idade: " + peixe.idade);
      peixe.emitirSom();
  }
}