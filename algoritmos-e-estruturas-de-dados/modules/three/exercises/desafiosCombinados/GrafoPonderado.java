package modules.three.exercises.desafiosCombinados;

import java.util.*;

// 9 - Caminho Mais Curto em Grafo Ponderado:
// Modifique o algoritmo BFS para encontrar o caminho mais curto entre dois nós em um grafo
// ponderado.

public class GrafoPonderado {
  int vertices;
  ArrayList<int[]>[] adj; // Lista de adjacência [vizinho, peso]

  public GrafoPonderado(int vertice) {
    this.vertices = vertice;
    this.adj = new ArrayList[vertice];
    for (int i = 0; i < vertice; i++)
      adj[i] = new ArrayList<>();
  }

  public void adicionarAresta(int origem, int destino, int peso) {
    adj[origem].add(new int[] { destino, peso });
    adj[destino].add(new int[] { origem, peso });
  }

  public void encontrarCaminho(int inicio, int destino) {
    // Array de distâncias: começa tudo com "infinito"
    int[] distancias = new int[vertices];
    Arrays.fill(distancias, Integer.MAX_VALUE);
    distancias[inicio] = 0;

    // Fila para processar os nós (como na BFS)
    Queue<Integer> fila = new LinkedList<>();
    fila.add(inicio);

    while (!fila.isEmpty()) {
      int atual = fila.poll();

      // Olhamos os vizinhos do nó atual
      for (int[] aresta : adj[atual]) {
        int vizinho = aresta[0];
        int pesoAresta = aresta[1];

        // Se o caminho (distancia atual + peso da aresta)
        // for menor do que o que já conhecíamos para o vizinho:
        if (distancias[atual] + pesoAresta < distancias[vizinho]) {
          distancias[vizinho] = distancias[atual] + pesoAresta;
          fila.add(vizinho); // Reavalia esse vizinho com o novo custo menor
        }
      }
    }

    System.out.println("Distância mínima do nó " + inicio + " ao " + destino + " é: " + distancias[destino]);
  }

  public static void main(String[] args) {
    GrafoPonderado grafo = new GrafoPonderado(4);
    grafo.adicionarAresta(0, 1, 10); // Direto (Custo 10)
    grafo.adicionarAresta(0, 2, 1); // Atalho por baixo...
    grafo.adicionarAresta(2, 1, 1); // ...que custa 2 no total (1+1)

    grafo.encontrarCaminho(0, 1);
  }
}
// algoritmo de ruas (como o da avenida paulista, SP)