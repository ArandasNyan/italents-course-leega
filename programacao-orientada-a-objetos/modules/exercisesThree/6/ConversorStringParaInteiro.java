import java.util.Scanner;

public class ConversorStringParaInteiro {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        String entrada = scanner.nextLine();

        try {
            int numero = Integer.parseInt(entrada);
            System.out.println("Número convertido com sucesso: " + numero);
        } catch (NumberFormatException e) {
            System.out.println("Erro: A string informada não é um número inteiro válido.");
            System.out.println("Detalhes técnicos: " + e.getMessage());
        }

        scanner.close();
    }
}