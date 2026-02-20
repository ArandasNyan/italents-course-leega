/* 9 - Desenvolva uma aplicação bancária simples com uma classe ContaBancaria que tenha um método transferir que lança uma exceção personalizada TransferenciaInvalidaException se a quantia a ser transferida for menor ou igual a zero. */

public class TransferenciaInvalidaException extends Exception {
    public TransferenciaInvalidaException(String message) {
        super(message);
    }
}