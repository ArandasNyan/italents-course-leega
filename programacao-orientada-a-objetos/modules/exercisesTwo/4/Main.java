public class Main {

  public static void main(String[] args) {

      // Criando objetos
      Veiculo moto = new Moto("Yamaha MT-07", 2022, 689, "Naked");
      Veiculo carro = new Carro("Toyota Corolla", 2023, "Preto", 4);

      System.out.println("=== Moto ===");
      moto.imprimirInformacoes();

      System.out.println("\n=== Carro ===");
      carro.imprimirInformacoes();
  }
}