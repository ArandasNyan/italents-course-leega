public class ContaCorrente extends ContaBancaria {

    private double taxaOperacao = 2.0;

    public ContaCorrente(String numeroConta, double saldoInicial) {
        super(numeroConta, saldoInicial);
    }

    @Override
    public void sacar(double valor) {
        double valorComTaxa = valor + taxaOperacao;

        if (valorComTaxa <= saldo) {
            saldo -= valorComTaxa;
            System.out.println("Saque realizado com taxa. Novo saldo: " + saldo);
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }
}