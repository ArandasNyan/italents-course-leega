import java.util.Scanner;

public class ContaBancaria {

    private double saldo;

    public ContaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public double getSaldo() {
        return saldo;
    }

    public void sacar(double valor) throws SaldoInsuficienteException {

        if (valor > saldo) {
            throw new SaldoInsuficienteException(
                    "Saldo insuficiente. Saldo atual: R$ " + saldo);
        }

        saldo -= valor;
        System.out.println("Saque realizado com sucesso. Novo saldo: R$ " + saldo);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ContaBancaria conta = new ContaBancaria(1000.0);

        System.out.print("Digite o valor para saque: ");
        double valor = scanner.nextDouble();

        try {
            conta.sacar(valor);
        } catch (SaldoInsuficienteException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        scanner.close();
    }
}
