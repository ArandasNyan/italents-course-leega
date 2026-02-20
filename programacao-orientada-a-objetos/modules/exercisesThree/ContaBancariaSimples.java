/* 7 - Crie uma exceção personalizada chamada SaldoInsuficienteException que é lançada quando uma tentativa de retirar mais dinheiro de uma conta do que o saldo disponível é feita. */

public class ContaBancariaSimples {
    private double saldo;

    public ContaBancariaSimples(double saldo) {
        this.saldo = saldo;
    }

    public void sacar(double valor) throws SaldoInsuficienteException {
        if (valor > saldo) {
            throw new SaldoInsuficienteException("Saldo insuficiente para saque.");
        }
        saldo -= valor;
    }
}