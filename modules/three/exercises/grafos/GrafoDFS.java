package modules.three.exercises.grafos;

import java.util.*;

// 7 - DFS em Grafos:
// Escreva um método para realizar a Busca em Profundidade (DFS) em um grafo, exibindo todos os
// vértices visitados.

public class GrafoDFS {
    private int numVertices;
    private ArrayList<Integer>[] adj; // Um array de listas

    // Construtor: definimos quantos nós o grafo terá
    public GrafoDFS(int vertices) {
        this.numVertices = vertices;
        this.adj = new ArrayList[vertices];
        
        // Inicializamos cada posição do array com uma lista vazia
        for (int i = 0; i < vertices; i++) {
            adj[i] = new ArrayList<Integer>();
        }
    }

    // Adiciona uma aresta (conexão)
    public void adicionarAresta(int u, int v) {
        adj[u].add(v);
        adj[v].add(u); // Grafo não direcionado
    }

    // Método principal da DFS
    public void dfs(int inicio) {
        boolean[] visitados = new boolean[numVertices];
        System.out.println("Visitando nós via DFS:");
        percorrer(inicio, visitados);
    }

    // O método que realmente faz a busca (Recursivo)
    private void percorrer(int atual, boolean[] visitados) {
        // 1. Marca o nó como visitado
        visitados[atual] = true;
        System.out.print(atual + " ");

        // 2. Pega a lista de vizinhos do nó atual
        ArrayList<Integer> vizinhos = adj[atual];

        // 3. Para cada vizinho, se não foi visitado, mergulha nele
        for (Integer vizinho : vizinhos) {
            if (!visitados[vizinho]) {
                percorrer(vizinho, visitados);
            }
        }
    }

    public static void main(String[] args) {
        // Criamos um grafo com 6 vértices (0 a 5)
        GrafoDFS grafo = new GrafoDFS(6);

        grafo.adicionarAresta(0, 1);
        grafo.adicionarAresta(0, 2);
        grafo.adicionarAresta(1, 3);
        grafo.adicionarAresta(1, 4);
        grafo.adicionarAresta(2, 5);

        grafo.dfs(0);
    }
}