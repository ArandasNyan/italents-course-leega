public class ContaPoupanca extends ContaBancaria {

  private static final double TAXA_JUROS = 0.065;

  public ContaPoupanca(String numeroConta, double saldoInicial) {
      super(numeroConta, saldoInicial);
  }

  @Override
  public void aplicarJuros() {
      saldo += saldo * TAXA_JUROS;
      System.out.println("Juros de 6,5% aplicados na Conta Poupança.");
  }
}