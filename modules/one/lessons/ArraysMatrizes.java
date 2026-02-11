package lessons;

import java.util.Scanner;

public class ArraysMatrizes {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Arrays
    int[] numeros = { 1, 2, 3, 4, 5 };
    int[] numeros2 = new int[5]; // limita o array a 5 indices { 1 , 2, 3, 4, 5 }

    // Matrizes
    int[][] matriz = {{ 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }}; 

    System.out.println(matriz[0]);

    System.out.print("Digite um número: ");
    numeros2[0] = Integer.parseInt(scanner.nextLine());
    System.out.println("O seu número é: " + numeros2[0]);
  }
}
