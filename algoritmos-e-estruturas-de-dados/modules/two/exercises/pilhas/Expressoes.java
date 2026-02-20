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
    String expression = "[{(5 + 5)} - 5]";

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

    // busco caractere dentro da minha expressão
    for (char caractere : expression.toCharArray()) {
      // verifico se há algum caractere de abertura
      if (caractere == '(' || caractere == '[' || caractere == '{') {
        // se houver eu adiciono
        pilha.push(caractere);
      } else if (caractere == '}' || caractere == ']' || caractere == ')') {
        // se não houver abertura então busco pelo fechamento
        if (pilha.isEmpty()) {
          // se na pilha não houver abertura então informo que a expressão está errada
          System.out.println("Erro: Tentou fechar '" + caractere + "' mas não havia nada aberto.");
          return false;
        }

        // se houver eu tiro do topo o caractere
        char topoDaPilha = pilha.pop();

        // verifico se o meu caracter atual é companheiro do que estava no topo da pilha
        if (!isCompanion(topoDaPilha, caractere)) {
          System.out.println(
              "Erro de correspondência: Abriu '" + topoDaPilha + "' mas tentou fechar com '" + caractere + "'.");
          return false;
        }
      }
    }

    if (!pilha.isEmpty()) {
      System.out.println("Erro: Os seguintes símbolos não foram fechados: " + pilha);
      return false;
    }

    return true;
  }

  // verifica se o topo da pilha é o companheiro correto do caractere encontrado
  private static boolean isCompanion(char topoDaPilha, char caractere) {
    return topoDaPilha == '(' && caractere == ')'
        || topoDaPilha == '[' && caractere == ']'
        || topoDaPilha == '{' && caractere == '}';
  }
}
