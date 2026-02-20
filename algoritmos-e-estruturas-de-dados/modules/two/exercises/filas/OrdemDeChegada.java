package modules.two.exercises.filas;

import java.util.LinkedList;
import java.util.Queue;

// 7 - Ordem de Chegada:
// Crie um programa para simular a ordem de chegada de elementos em uma fila e exiba a ordem de
// saída.

public class OrdemDeChegada {

  public static void main(String[] args) {
      // Criando a fila de elementos (podem ser strings, objetos, etc.)
      Queue<String> fila = new LinkedList<>();

      // Simulando a Ordem de Chegada (Inserção)
      System.out.println("--- ENTRADA NA FILA ---");
      String[] chegadas = {"Elemento A", "Elemento B", "Elemento C", "Elemento D"};

      // itero elemento a elemento e adiciono por ordem de chegada na fila
      for (String elemento : chegadas) {
          fila.add(elemento);
          System.out.println("-> " + elemento + " chegou.");
      }

      System.out.println("\nStatus atual da fila: " + fila);

      // Simulando a Ordem de Saída (Remoção)
      System.out.println("\n--- ORDEM DE SAÍDA ---");
      
      // Enquanto a fila não estiver vazia, removemos o próximo
      while (!fila.isEmpty()) {
          // poll() remove o elemento da frente (o que chegou primeiro)
          String saiu = fila.poll();
          System.out.println("<- " + saiu + " saiu.");
      }

      // indica o status da fila para dúvidas
      System.out.println("\nA fila está vazia? " + (fila.isEmpty() ? "Sim" : "Não"));
      System.out.println(fila);
  }
}
