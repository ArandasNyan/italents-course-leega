import java.util.Scanner;

public class DivisaoPorZero {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        try {
            int resultado = numero / 0; // Forçando divisão por zero
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Erro: Não é possível dividir um número por zero.");
        }

        scanner.close();
    }
}