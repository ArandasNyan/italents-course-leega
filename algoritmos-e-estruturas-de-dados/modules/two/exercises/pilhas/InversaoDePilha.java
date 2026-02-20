package modules.two.exercises.pilhas;

import java.util.ArrayDeque;
import java.util.Deque;

// 5 - Inversão com Pilha:
// Implemente um método para inverter a ordem dos elementos em um ArrayList utilizando uma pilha

public class InversaoDePilha {
  public static void main(String[] args) {
    Deque<String> pilhaDeNumeros = new ArrayDeque<>();
    // facilitar a vida de um dev de escrever 10 vezes a mesma coisa né
    for(int i = 1; i <= 10; i++) {
      pilhaDeNumeros.add(String.valueOf(i));
    }

    System.out.println(pilhaDeNumeros);

    // invertendo a lista
    Deque<String> listaInvertida = inverterOrdem(pilhaDeNumeros);
    System.out.println(listaInvertida);
  }

  public static Deque<String> inverterOrdem(Deque<String> pilhaDeNumeros) {
    Deque<String> listaInvertida = new ArrayDeque<>();

    // faço a condição até que a pilha de número correta esteja vazia
    while(!pilhaDeNumeros.isEmpty()) {
      // removendo através do metodo removeLast da pilha adiciono por meio de
      // addLast para que o primeiro item da pilha de número seja o ultimo a vir
      // essa condição será percorrida até que como dito antes, a pilha esteja vazia
      listaInvertida.addLast(pilhaDeNumeros.removeLast());
    }

    // retorno a lista invertida
    return listaInvertida;
  }
}
