package modules.two.exercises.ordenacao;

import java.util.ArrayList;
import java.util.Arrays;

// 10 - Implementação de Algoritmo de Ordenação:
// Escolha um algoritmo de ordenação (ex: Bubble Sort, Quick Sort, Merge Sort) e implemente-o para
// ordenar um ArrayList de números inteiros de forma decrescente.

public class Ordenacao {
    public static void main(String[] args) {
        // Criando um ArrayList de exemplo
        ArrayList<Integer> numeros = new ArrayList<>(Arrays.asList(5, 2, 9, 1, 3, 6));

        System.out.println("Lista Original: " + numeros);

        bubbleSortDecrescente(numeros);

        System.out.println("Lista Ordenada (Decrescente): " + numeros);
    }

    public static void bubbleSortDecrescente(ArrayList<Integer> lista) {
        int n = lista.size();
        boolean swap;

        // o laço irá controlar quantas passadas faremos
        for (int i = 0; i < n - 1; i++) {
            swap = false;

            for (int j = 0; j < (n - 1 - i); j++) {
                
                //Se o atual for MENOR que o próximo, troca
                if (lista.get(j) < lista.get(j + 1)) {
                    // Realizando a troca
                    int temp = lista.get(j); // 5 < 2 ? arr[0] = 2 e arr[1] = 5
                    lista.set(j, lista.get(j + 1));
                    lista.set(j + 1, temp);
                    
                    swap = true;
                }
            }

            // se não houve nenhuma troca, a lista já está ordenada
            if (!swap) break;
        }
    }
}