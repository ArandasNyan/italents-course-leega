package exercises;

// Exercício 2: Estruturas Condicionais
// • Escreva um programa que leia um número e determine se ele é par ou ímpar. Imprima o
//   resultado na tela.

public class ExerciseTwo {
  public static void main(String[] args) {
    int isEven = 8;

    if ((isEven % 2) == 0) {
      System.out.println("O número " + isEven + " é par");
    } else {
      System.out.println("O número " + isEven + " é ímpar");
    }
  }
}
