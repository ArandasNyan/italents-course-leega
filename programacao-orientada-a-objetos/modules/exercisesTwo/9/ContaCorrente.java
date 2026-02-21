public class ContaCorrente extends ContaBancaria {

  private static final double TAXA_JUROS = 0.15;

  public ContaCorrente(String numeroConta, double saldoInicial) {
      super(numeroConta, saldoInicial);
  }

  @Override
  public void aplicarJuros() {
      saldo += saldo * TAXA_JUROS;
      System.out.println("Juros de 15% aplicados na Conta Corrente.");
  }
}