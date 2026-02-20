/* 6 - Implemente um programa que converta uma string em um número inteiro. Utilize um bloco try-catch para capturar a exceção NumberFormatException caso a string não seja um número válido. */

import java.util.Scanner;

public class MainConversorString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma string para converter em número: ");
        String str = scanner.nextLine();
        try {
            int numero = Integer.parseInt(str);
            System.out.println("Número: " + numero);
        } catch (NumberFormatException e) {
            System.out.println("Erro: A string não é um número válido.");
        }
        scanner.close();
    }
}