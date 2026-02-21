public class Main {

  public static void main(String[] args) {

      ContaBancaria contaCorrente = new ContaCorrente("123", 1000);
      ContaBancaria contaPoupanca = new ContaPoupanca("456", 1000);

      System.out.println("=== Conta Corrente ===");
      contaCorrente.depositar(500);
      contaCorrente.sacar(200);

      System.out.println("\n=== Conta Poupança ===");
      contaPoupanca.depositar(300);
      contaPoupanca.sacar(100);
  }
}