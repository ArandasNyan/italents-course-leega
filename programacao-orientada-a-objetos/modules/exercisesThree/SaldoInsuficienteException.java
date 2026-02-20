/* 7 - Crie uma exceção personalizada chamada SaldoInsuficienteException que é lançada quando uma tentativa de retirar mais dinheiro de uma conta do que o saldo disponível é feita. */

public class SaldoInsuficienteException extends Exception {
    public SaldoInsuficienteException(String message) {
        super(message);
    }
}