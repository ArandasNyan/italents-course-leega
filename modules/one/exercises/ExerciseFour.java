package exercises;

import java.util.ArrayList;
import java.util.Scanner;

// Exercício 4: Listas (ArrayList)
// • Implemente um programa que permita ao usuário adicionar e remover elementos de uma
// lista dinâmica (por exemplo, ArrayList) de números inteiros.

public class ExerciseFour {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Integer> listOfNumber = new ArrayList<Integer>();
    boolean running = true;

    while (running) {
      System.out.println(
          "Escolha uma das opções abaixo!\n\n1 - Adicionar um número a lista\n2 - Remover um número da lista\n0 - Sair do app!");
      int option = Integer.parseInt(scanner.nextLine());

      switch (option) {
        case 1:
          System.out.print("Qual número deseja adicionar? R:");
          int numberToAdd = Integer.parseInt(scanner.nextLine());
          listOfNumber.add(numberToAdd);
          System.out.print(">>>>> " + listOfNumber.toString() + " <<<<<\n\n");
          break;
        case 2:
          System.out.print("Qual número deseja remover? R:");
          int numberToRemove = Integer.parseInt(scanner.nextLine());
          listOfNumber.remove(Integer.valueOf(numberToRemove));
          System.out.println(">>>>> " + listOfNumber.toString() + " <<<<<\n\n");
          break;
        case 0:
          System.out.println("Aplicação encerrada!");
          running = false;
          break;
        default:
          System.out.println("Opção inválida, utilize apenas os números do menu!\n\n");
      }
    }

    scanner.close();
  }
}