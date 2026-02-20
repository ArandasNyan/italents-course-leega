/* 3 - Implemente uma classe ContaBancaria com atributos como saldo e número da conta. Em seguida, crie duas subclasses, ContaCorrente e ContaPoupanca, que herdam de ContaBancaria. */

public class ContaBancaria {
    protected double saldo;
    protected String numeroConta;

    public ContaBancaria(String numeroConta, double saldoInicial) {
        this.numeroConta = numeroConta;
        this.saldo = saldoInicial;
    }

    public void aplicarJuros() {
        // Método base, pode ser vazio ou padrão
    }
}