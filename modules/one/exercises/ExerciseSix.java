package exercises;

import java.util.ArrayList;

// Exercício 6: Estruturas Condicionais e Laços
// • Escreva um programa que encontre todos os números primos entre 1 e 100 e imprima-os na
// tela.

public class ExerciseSix {
  public static void main(String[] args) {
    // lista que vai armarzenar todos os números que forem 
    // identificados como primos e facilitar a visualização 
    // horizontal do resultado
    ArrayList<Integer> numerosPrimos = new ArrayList<>();

    // Laço principal que percorre todos os números de 2 até 100
    // Começa em 2 porque 1 não é considerado número primo
    for (int numero = 2; numero <= 100; numero++) {
      // Assume inicialmente que o número atual é primo
      // Se encontrarmos um divisor, essa variável será alterada para false
      boolean primo = true;

      // Testa todos os possíveis divisores entre 2 e os números anteriores
      for (int divisor = 2; divisor < numero; divisor++) {
        
        // Se o número for divisível por qualquer valor diferente de 1 e dele mesmo,
        // então ele não é primo
        if (numero % divisor == 0) {
          primo = false;
        }
      }

      // Se após todos os testes o número continuar sendo considerado primo,
      // ele é adicionado à lista
      if (primo) {
        numerosPrimos.add(numero);
      }
    }

    // exibição da lista
    System.out.println(numerosPrimos);
  }
}