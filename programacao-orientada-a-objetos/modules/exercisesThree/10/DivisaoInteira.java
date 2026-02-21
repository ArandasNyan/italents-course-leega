import java.util.Scanner;

public class DivisaoInteira {

    public int dividir(int dividendo, int divisor)
            throws DivisaoInteiraInvalidaException {

        if (divisor == 0) {
            throw new DivisaoInteiraInvalidaException(
                    "Não é possível dividir por zero.");
        }

        if (dividendo % divisor != 0) {
            throw new DivisaoInteiraInvalidaException(
                    "A divisão não é exata. Resto diferente de zero.");
        }

        return dividendo / divisor;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        DivisaoInteira calculadora = new DivisaoInteira();

        System.out.print("Digite o dividendo: ");
        int dividendo = scanner.nextInt();

        System.out.print("Digite o divisor: ");
        int divisor = scanner.nextInt();

        try {
            int resultado = calculadora.dividir(dividendo, divisor);
            System.out.println("Resultado da divisão exata: " + resultado);
        } catch (DivisaoInteiraInvalidaException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        scanner.close();
    }
}