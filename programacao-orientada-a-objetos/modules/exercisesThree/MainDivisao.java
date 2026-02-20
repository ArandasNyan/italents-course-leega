/* 4 - Escreva um programa que solicite ao usuário que insira um número e o divida por zero. Utilize um bloco try-catch para capturar a exceção ArithmeticException e exiba uma mensagem amigável ao usuário. */

import java.util.Scanner;

public class MainDivisao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();
        try {
            int resultado = numero / 0;
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Erro: Não é possível dividir por zero.");
        }
        scanner.close();
    }
}