package exercises;

import java.util.ArrayList;
import java.util.Scanner;

// Exercício 8: Estruturas Condicionais e Listas
// • Crie um programa que solicite ao usuário que insira uma lista de números inteiros e, em
// seguida, encontre e exiba o número que mais se repete.

public class ExerciseEight {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Integer> listaDeNumerosInteiros = new ArrayList<>();

    // Controla o loop enquanto o usuário quiser continuar digitando números
    boolean desejaAdicionarMaisNumero = true;

    // Loop principal da aplicação
    while (desejaAdicionarMaisNumero) {
      // Mensagem inicial explicando como encerrar o programa
      System.out.print(
          "============= Contador de Repetições =============\n\n" +
              "Utilize (-1) para encerrar a aplicação\n\n" +
              "Informe o número que deseja adicionar à lista: ");

      // Garante que o valor digitado seja realmente um número inteiro
      if (scanner.hasNextInt()) {
        int input = scanner.nextInt();

        // Se o usuário digitar -1, encerramos a entrada de dados
        if (input == -1) {

          System.out.println("Aplicação encerrada!");
          desejaAdicionarMaisNumero = false;

          // a exibição do número ocorrerá apenas se a lista não estiver vazia!
          if (!listaDeNumerosInteiros.isEmpty()) {
            int[] resultado = buscarMaiorRepeticao(listaDeNumerosInteiros);
            System.out.println("\nO número mais repetido é: " + resultado[0] +
                " (Aparece " + resultado[1] + " vezes)");
          } else {
            System.out.println("Nenhum número foi inserido na lista.");
          }
        } else {
          // Caso não seja -1, adiciona o número na lista
          listaDeNumerosInteiros.add(input);

          // Mostra a lista atualizada ao usuário
          System.out.println("Lista de números atualizada:\n" + listaDeNumerosInteiros);
        }

      } else {
        // Caso o usuário digite algo que não seja número inteiro
        System.out.println("\n⚠ Entrada inválida! Digite apenas números inteiros.\n");

        // Limpa a entrada inválida para evitar loop infinito
        scanner.next();
      }
    }

    scanner.close();
  }

  public static int[] buscarMaiorRepeticao(ArrayList<Integer> lista) {
    // Assume inicialmente que o primeiro número da lista é o mais repetido
    int maisRepetido = lista.get(0);

    // Guarda a maior quantidade de repetições encontrada até o momento
    int maxRepeticoes = 0;

    // Percorre cada número da lista
    for (int i = 0; i < lista.size(); i++) {
      int numeroAtual = lista.get(i);
      int contador = 0;

      // Para cada número, percorre novamente a lista inteira
      // contando quantas vezes ele aparece
      for (int j = 0; j < lista.size(); j++) {
        // Usa equals para comparar corretamente objetos Integer
        if (lista.get(j).equals(numeroAtual)) {
          contador++;
        }
      }

      // Se esse número tiver mais repetições que o anterior,
      // atualiza as variáveis de controle
      if (contador > maxRepeticoes) {
        maisRepetido = numeroAtual;
        maxRepeticoes = contador;
      }
    }

    // Retorna um array contendo:
    // resultado[0] → número com mais repetições
    // resultado[1] → quantas repetições o número teve
    int[] resultado = { maisRepetido, maxRepeticoes };

    return resultado;
  }
}