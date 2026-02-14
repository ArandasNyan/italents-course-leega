package modules.two.exercises.ordenacao;

import java.util.ArrayList;
import java.util.Arrays;

// 10 - Implementação de Algoritmo de Ordenação:
// Escolha um algoritmo de ordenação (ex: Bubble Sort, Quick Sort, Merge Sort) e implemente-o para
// ordenar um ArrayList de números inteiros de forma decrescente.

public class Ordenacao {
    public static void main(String[] args) {
        // Criando um ArrayList de exemplo
        ArrayList<Integer> numeros = new ArrayList<>(Arrays.asList(5, 2, 9, 1, 5, 6));

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

            // laço children compara os vizinhos
            // n - 1 - i evita comparar elementos que já estão na posição correta
            // pega o tamanho do meu array (n) menos uma posição e informa que
            // só irá validar a partir do meu indice (i) atual e não antes dele
            // evita que ele troque posições que já estão certas!
            for (int j = 0; j < (n - 1 - i); j++) {
                
                //Se o atual for MENOR que o próximo, troca
                if (lista.get(j) < lista.get(j + 1)) {
                    // Realizando a troca
                    int temp = lista.get(j);
                    lista.set(j, lista.get(j + 1));
                    lista.set(j + 1, temp);
                    
                    swap = true;
                }
            }

            // Otimização: se não houve nenhuma troca, a lista já está ordenada
            if (!swap) break;
        }
    }
}