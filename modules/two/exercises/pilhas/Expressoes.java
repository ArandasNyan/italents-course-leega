package modules.two.exercises.pilhas;

import java.util.ArrayDeque;
import java.util.Deque;

// 4 - Verificação de Expressões:
// Utilizando pilhas, desenvolva um programa para verificar se uma expressão matemática contendo
// parênteses está balanceada

public class Expressoes {
  public static void main(String[] args) {
    // meta de expressões, apenas: ()
    // declaro uma variavel com expressão matemática usando parenteses
    String expression = "[{(5 + 5} - 5]";

    // verifico se o balanceamento é valido
    if (check(expression)) {
      System.out.println("A expressão " + expression + " está balanceada!");
    } else {
      // se não for, informo o erro e passo o feedback do ajuste
      System.out.println("A expressão " + expression + " não está balanceada!");
    }

  }

  public static boolean check(String expression) {
    Deque<Character> pilha = new ArrayDeque<>();

    for(char caractere : expression.toCharArray()) {
      if (caractere == '(' || caractere == '[' || caractere == '{') {
        pilha.push(caractere);
      } else if (caractere == '}' || caractere == ']' || caractere == ')') {
        if(pilha.isEmpty()) {
          System.out.println("Você esqueceu de abrir o companheiro de >>> " + caractere + " <<<\n");
          return false;
        }

        char topoDaPilha = pilha.pop();

        // o topo da pilha é o companheiro correto do caractere atual
        if (!isCompanion(topoDaPilha, caractere)) {
          System.out.println("Você esqueceu de fechar o companheiro de >>> " + topoDaPilha + " <<<\n");
          // retorno é false se não for o correto
          return false;
        }
      }
    }

    return pilha.isEmpty(); // se houver algo na pilha então a expressão está errada!
  }

  // verifica se o topo da pilha é o companheiro correto do caractere encontrado
  private static boolean isCompanion(char topoDaPilha, char caractere) {
    return topoDaPilha == '(' && caractere == ')' 
    || topoDaPilha == '[' && caractere == ']' 
    || topoDaPilha == '{' && caractere == '}';
  }
}
