package modules.three.exercises.grafos;

import java.util.*;

// 6 - BFS em Grafos:
// Implemente o algoritmo de Busca em Largura (BFS) para encontrar o caminho mais curto entre dois
// nós em um grafo não ponderado.

public class GrafoBFS {
    private Map<Integer, List<Integer>> adjacencias = new HashMap<>();

    public void adicionarAresta(int u, int v) {
        adjacencias.computeIfAbsent(u, k -> new ArrayList<>()).add(v);
        adjacencias.computeIfAbsent(v, k -> new ArrayList<>()).add(u);
    }

    public List<Integer> encontrarCaminhoCurto(int inicio, int destino) {
        // Fila para a BFS e conjunto para não repetir nós
        Queue<Integer> fila = new LinkedList<>();
        Set<Integer> visitados = new HashSet<>();

        // Mapa para guardar de onde viemos: Chave = nó atual, Valor = pai dele
        Map<Integer, Integer> predecessores = new HashMap<>();

        fila.add(inicio);
        visitados.add(inicio);

        while (!fila.isEmpty()) {
            int atual = fila.poll();

            // Se chegamos no destino, vamos reconstruir o caminho
            if (atual == destino) {
                return reconstruirCaminho(predecessores, inicio, destino);
            }

            for (int vizinho : adjacencias.getOrDefault(atual, new ArrayList<>())) {
                if (!visitados.contains(vizinho)) {
                    visitados.add(vizinho);
                    predecessores.put(vizinho, atual); // Salvamos que chegamos no vizinho pelo 'atual'
                    fila.add(vizinho);
                }
            }
        }
        return null; // Não há caminho
    }

    private List<Integer> reconstruirCaminho(Map<Integer, Integer> pais, int inicio, int destino) {
        List<Integer> caminho = new LinkedList<>();
        Integer passo = destino;

        // Voltamos do destino para o início usando o mapa de pais
        while (passo != null) {
            caminho.add(0, passo); // Adiciona no início da lista para manter a ordem certa
            passo = pais.get(passo);
        }
        return caminho;
    }

    public static void main(String[] args) {
        GrafoBFS g = new GrafoBFS();
        g.adicionarAresta(1, 2);
        g.adicionarAresta(1, 3);
        g.adicionarAresta(2, 4);
        g.adicionarAresta(3, 5);
        g.adicionarAresta(4, 6);
        g.adicionarAresta(5, 6);

        System.out.println("Caminho curto de 1 a 6: " + g.encontrarCaminhoCurto(1, 6));
    }
}
