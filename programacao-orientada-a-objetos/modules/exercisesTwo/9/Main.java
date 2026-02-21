import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<ContaBancaria> contas = new ArrayList<>();

        contas.add(new ContaCorrente("123", 1000));
        contas.add(new ContaPoupanca("456", 1000));

        for (ContaBancaria conta : contas) {
            System.out.println("Saldo antes: " + conta.getSaldo());
            conta.aplicarJuros();  // Polimorfismo
            System.out.println("Saldo depois: " + conta.getSaldo());
            System.out.println();
        }
    }
}