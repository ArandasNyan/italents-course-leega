package modules.two.exercises.listas;

import java.util.ArrayList;

// 1 - Inversão de Lista:
// Escreva um programa para inverter os elementos de um ArrayList sem usar métodos prontos do
// java.

public class InversaoDeLista {
  public static void main(String[] args) {
    // Criação da lista de compras
    ArrayList<String> listaDeCompras = new ArrayList<>();

    // Criação de uma segunda lista para inversão manual da lista evitando uso de métodos prontos
    ArrayList<String> listaDeComprasInvertida = new ArrayList<>();

    // adicionando itens a lista de compras
    listaDeCompras.add("Kiwi");
    listaDeCompras.add("Maçã");
    listaDeCompras.add("Banana");
    listaDeCompras.add("Uva");
    listaDeCompras.add("Morango");

    // Checagem da lista de compras
    System.out.println("Lista: " + listaDeCompras);

    // decremento do tamanho do array para 0
    // o de -1 com o size do array é para evitar que o laço tente adicionar um item vazio na posição 0
    for (int i = listaDeCompras.size() - 1; i >= 0; i--) {
      // adiciono o ultimo item da lista de compras a nova lista da ULTIMA posição para a primeira
      listaDeComprasInvertida.add(listaDeCompras.get(i));
    }

    // Checagem da inversão dos itens
    System.out.println("Lista Invertida: " + listaDeComprasInvertida);
  }
}
