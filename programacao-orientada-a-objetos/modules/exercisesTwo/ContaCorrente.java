/* 3 - Implemente uma classe ContaBancaria com atributos como saldo e número da conta. Em seguida, crie duas subclasses, ContaCorrente e ContaPoupanca, que herdam de ContaBancaria. */

public class ContaCorrente extends ContaBancaria {
    public ContaCorrente(String numeroConta, double saldoInicial) {
        super(numeroConta, saldoInicial);
    }

    @Override
    public void aplicarJuros() {
        saldo += saldo * 0.15;
    }
}