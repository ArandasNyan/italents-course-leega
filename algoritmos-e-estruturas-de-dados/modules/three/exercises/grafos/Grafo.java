package modules.three.exercises.grafos;

import java.util.*;

// 5 - Representação de Grafos:
// Crie uma classe que represente um grafo em Java utilizando lista de adjacências ou matriz de
// adjacências.

public class Grafo {
    // O Grafo é um mapa onde cada número (Vértice) tem uma lista de vizinhos
    private Map<Integer, List<Integer>> adjacencias;

    public Grafo() {
        this.adjacencias = new HashMap<>();
    }

    // Adiciona um novo vértice ao grafo
    public void adicionarVertice(int vertice) {
        // Se o vértice NÃO está no mapa
        if (!adjacencias.containsKey(vertice)) {
            // eu adiciono ele com uma lista de vizinhos vazia
            adjacencias.put(vertice, new ArrayList<>());
        }
    }

    // Adiciona uma aresta (conexão) entre dois vértices
    public void adicionarAresta(int origem, int destino) {
        // Garante que os vértices existam
        adicionarVertice(origem);
        adicionarVertice(destino);
        
        // Adiciona o vizinho
        adjacencias.get(origem).add(destino);
    }

    // Imprime o grafo para visualizarmos
    public void imprimirGrafo() {
        for (int vertice : adjacencias.keySet()) {
            System.out.println(vertice + " -> " + adjacencias.get(vertice));
        }
    }

    public static void main(String[] args) {
        Grafo grafo = new Grafo();
        
        grafo.adicionarAresta(1, 2);
        grafo.adicionarAresta(1, 3);
        grafo.adicionarAresta(2, 4);
        grafo.adicionarAresta(3, 4);
        grafo.adicionarAresta(4, 1);

        System.out.println("Representação do Grafo (Lista de Adjacência):");
        grafo.imprimirGrafo();
    }
}