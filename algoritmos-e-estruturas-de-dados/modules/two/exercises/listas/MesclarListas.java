package modules.two.exercises.listas;

import java.util.ArrayList;

// 3 - Mesclar Listas:
// Implemente uma função que receba duas ArrayLists e retorne uma nova lista que contenha todos os
// elementos das listas originais intercalados.

public class MesclarListas {
  public static void main(String[] args) {
    ArrayList<Integer> listaOne = new ArrayList<>();
    ArrayList<Integer> listaTwo = new ArrayList<>();

    // Lista 1 - Apenas Pares de 0 a 10
    listaOne.add(0);
    listaOne.add(2);
    listaOne.add(4);
    listaOne.add(6);
    listaOne.add(8);
    listaOne.add(10);

    // Lista 2 - Apenas Ímpares de 0 a 10
    listaTwo.add(1);
    listaTwo.add(3);
    listaTwo.add(5);
    listaTwo.add(7);
    listaTwo.add(9);
    // listaTwo.add(11);
    // listaTwo.add(13);

    ArrayList<Integer> listasMescladas = mesclarListas(listaOne, listaTwo);

    System.out.println(listasMescladas);
  }

  public static ArrayList<Integer> mesclarListas(ArrayList<Integer> listaOne, ArrayList<Integer> listaTwo) {
    // cria uma nova lista
    ArrayList<Integer> listaMesclada = new ArrayList<>();
    // decide qual array é maior e determina o valor inteiro para a variavel
    int arraysSize = listaOne.size() >= listaTwo.size() ? listaOne.size() : listaTwo.size();

    // irá de 0 até o valor do maior array
    for (int i = 0; i < arraysSize; i++) {
      // verifico se a iteração é menor que o tamanho do primeiro array para evitar exception of bounds
      if (i < listaOne.size()) {
        listaMesclada.add(listaOne.get(i));
      }

      // verifico se a iteração é menor que o tamanho do segundo array para evitar exception of bounds
      if (i < listaTwo.size()) {
        listaMesclada.add(listaTwo.get(i));
      }
    }

    // retorno a lista mesclada
    return listaMesclada;
  }
}
