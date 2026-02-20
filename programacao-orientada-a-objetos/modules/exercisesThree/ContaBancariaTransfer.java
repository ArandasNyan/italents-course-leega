/* 9 - Desenvolva uma aplicação bancária simples com uma classe ContaBancaria que tenha um método transferir que lança uma exceção personalizada TransferenciaInvalidaException se a quantia a ser transferida for menor ou igual a zero. */

public class ContaBancariaTransfer {
    private double saldo;

    public ContaBancariaTransfer(double saldo) {
        this.saldo = saldo;
    }

    public void transferir(double valor) throws TransferenciaInvalidaException {
        if (valor <= 0) {
            throw new TransferenciaInvalidaException("Valor de transferência inválido.");
        }
        // Simulação de transferência
        System.out.println("Transferência de " + valor + " realizada.");
    }
}