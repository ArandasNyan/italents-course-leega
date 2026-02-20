package modules.three.exercises.desafiosCombinados;

import java.util.*;

// 10 - Ordenação de Grafos:
// Implemente um algoritmo para ordenar os vértices de um grafo, de acordo com a topologia das
// conexões entre eles.

public class OrdenacaoTopologica {
    private int vertices;
    private ArrayList<Integer>[] adj;

    // Cria a estrutura para guardar o grafo
    public OrdenacaoTopologica(int vertice) {
        this.vertices = vertice;
        this.adj = new ArrayList[vertice];
        // Cria uma lista vazia para cada "tarefa" do grafo
        for (int i = 0; i < vertice; i++) {
            adj[i] = new ArrayList<>();
        }
    }

    // Diz que a 'origem' deve vir antes do 'destino'
    public void adicionarAresta(int origem, int destino) {
        adj[origem].add(destino); 
    }

    // (DFS): Entra fundo nas conexões para achar quem depende de quem
    private void dfsTopologica(int atual, boolean[] visitados, Deque<Integer> pilha) {
        // Marca que já passou por aqui para não trabalhar duas vezes no mesmo nó
        visitados[atual] = true;

        // "Para cada tarefa que depende desta que estou agora..."
        for (int vizinho : adj[atual]) {
            // Se eu ainda não explorei esse vizinho, vou lá olhar ele agora
            if (visitados[vizinho] == false) {
                dfsTopologica(vizinho, visitados, pilha);
            }
        }

        // Se chegou aqui, é porque todas as dependências desse nó já foram olhadas.
        // Então "guardamos" esse nó na pilha como concluído.
        pilha.push(atual);
    }

    // O ponto de partida que limpa a mesa e começa o trabalho
    public void ordenar() {
        Deque<Integer> pilha = new ArrayDeque<>();
        boolean[] visitados = new boolean[vertices];

        // Passa por todas as tarefas do grafo, do começo ao fim
        for (int i = 0; i < vertices; i++) {
            // Se a tarefa ainda está "esquecida" (não visitada), começa a exploração
            if (visitados[i] == false) {
                dfsTopologica(i, visitados, pilha);
            }
        }

        // Mostra o resultado final tirando da pilha
        System.out.println("Ordenação Topológica");
        while (pilha.isEmpty() == false) {
            // Tira quem está no topo e mostra (quem não tinha dependência sai primeiro)
            System.out.print(pilha.pop() + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Criamos um grafo com 6 vertices (de 0 a 5)
        OrdenacaoTopologica grafo = new OrdenacaoTopologica(6);
        
        // Adicionamos as regras de prioridade:
        grafo.adicionarAresta(5, 2); // 5 antes de 2
        grafo.adicionarAresta(5, 0); // 5 antes de 0
        grafo.adicionarAresta(4, 0); // 4 antes de 0
        grafo.adicionarAresta(4, 1); // 4 antes de 1
        grafo.adicionarAresta(2, 3); // 2 antes de 3
        grafo.adicionarAresta(3, 1); // 3 antes de 1

        // Chama o método que organiza e imprime tudo
        grafo.ordenar(); 
    }
}