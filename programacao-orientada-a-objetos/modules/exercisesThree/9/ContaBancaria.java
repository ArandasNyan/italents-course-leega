public class ContaBancaria {

  private String titular;
  private double saldo;

  public ContaBancaria(String titular, double saldoInicial) {
      this.titular = titular;
      this.saldo = saldoInicial;
  }

  public String getTitular() {
      return titular;
  }

  public double getSaldo() {
      return saldo;
  }

  public void depositar(double valor) {
      if (valor > 0) {
          saldo += valor;
      }
  }

  public void transferir(ContaBancaria destino, double valor)
          throws TransferenciaInvalidaException {

      if (valor <= 0) {
          throw new TransferenciaInvalidaException(
              "A quantia para transferência deve ser maior que zero."
          );
      }

      if (valor > saldo) {
          throw new TransferenciaInvalidaException(
              "Saldo insuficiente para realizar a transferência."
          );
      }

      this.saldo -= valor;
      destino.saldo += valor;

      System.out.println("Transferência realizada com sucesso.");
  }
}