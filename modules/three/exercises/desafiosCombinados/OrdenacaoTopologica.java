package modules.three.exercises.desafiosCombinados;

import java.util.*;

// 10 - Ordenação de Grafos:
// Implemente um algoritmo para ordenar os vértices de um grafo, de acordo com a topologia das
// conexões entre eles.

public class OrdenacaoTopologica {
    private int vertices;
    private ArrayList<Integer>[] adj;

    public OrdenacaoTopologica(int vertice) {
        this.vertices = vertice;
        this.adj = new ArrayList[vertice];
        for (int i = 0; i < vertice; i++) adj[i] = new ArrayList<>();
    }

    public void adicionarAresta(int origem, int destino) {
        adj[origem].add(destino); // Direcionado: u -> v (u deve vir antes de v)
    }

    private void dfsTopologica(int destino, boolean[] visitados, Deque<Integer> pilha) {
        visitados[destino] = true;

        // Visita todos os vizinhos (pré-requisitos)
        for (int vizinho : adj[destino]) {
            if (!visitados[vizinho]) {
                dfsTopologica(vizinho, visitados, pilha);
            }
        }

        // Depois de visitar tudo que depende dele, coloca na pilha
        pilha.push(destino);
    }

    public void ordenar() {
        Deque<Integer> pilha = new ArrayDeque<>();
        boolean[] visitados = new boolean[vertices];

        // Garante que todos os nós sejam visitados (mesmo se o grafo for desconexo)
        for (int i = 0; i < vertices; i++) {
            if (!visitados[i]) {
                dfsTopologica(i, visitados, pilha);
            }
        }

        // Exibe os elementos da pilha (que já saem na ordem correta)
        System.out.println("Ordenação Topológica:");
        while (!pilha.isEmpty()) {
            System.out.print(pilha.pop() + " ");
        }
    }

    public static void main(String[] args) {
        OrdenacaoTopologica grafo = new OrdenacaoTopologica(6);
        // Pense nisso como dependências de tarefas:
        grafo.adicionarAresta(5, 2);
        grafo.adicionarAresta(5, 0);
        grafo.adicionarAresta(4, 0);
        grafo.adicionarAresta(4, 1);
        grafo.adicionarAresta(2, 3);
        grafo.adicionarAresta(3, 1);

        grafo.ordenar(); 
        // Resultado esperado: tarefas que não dependem de ninguém primeiro.
    }
}
