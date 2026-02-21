public abstract class ContaBancaria {

  protected String numeroConta;
  protected double saldo;

  public ContaBancaria(String numeroConta, double saldoInicial) {
      this.numeroConta = numeroConta;
      this.saldo = saldoInicial;
  }

  public void depositar(double valor) {
      saldo += valor;
  }

  public void sacar(double valor) {
      if (valor <= saldo) {
          saldo -= valor;
      } else {
          System.out.println("Saldo insuficiente.");
      }
  }

  public double getSaldo() {
      return saldo;
  }

  // Método abstrato
  public abstract void aplicarJuros();
}