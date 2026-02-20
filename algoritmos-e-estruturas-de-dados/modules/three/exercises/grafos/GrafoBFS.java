package modules.three.exercises.grafos;

import java.util.*;

// 6 - BFS em Grafos:
// Implemente o algoritmo de Busca em Largura (BFS) para encontrar o caminho mais curto entre dois
// nós em um grafo não ponderado.

public class GrafoBFS {
    // O mapa guarda: Número do Vértice -> Lista de seus Vizinhos
    private Map<Integer, List<Integer>> adjacencias = new HashMap<>();

    public void adicionarConexao(int verticeA, int verticeB) {
        // Se o verticeA não existe no mapa, criamos a lista dele
        if (adjacencias.get(verticeA) == null) {
            adjacencias.put(verticeA, new ArrayList<>());
        }
        // Adicionamos o verticeB como vizinho do verticeA
        adjacencias.get(verticeA).add(verticeB);

        // Como o caminho funciona para os dois lados, fazemos o inverso
        if (adjacencias.get(verticeB) == null) {
            adjacencias.put(verticeB, new ArrayList<>());
        }
        adjacencias.get(verticeB).add(verticeA);
    }

    public List<Integer> encontrarCaminhoCurto(int inicio, int destino) {
        Queue<Integer> fila = new LinkedList<>();
        Set<Integer> visitados = new HashSet<>();
        
        // Mapa para lembrar de onde viemos: "Quem é o pai deste vértice?"
        Map<Integer, Integer> quemMeTrouxeAqui = new HashMap<>();

        fila.add(inicio);
        visitados.add(inicio);

        while (fila.isEmpty() == false) {
            int atual = fila.poll();

            // Se o atual for o que estamos buscando, paramos e montamos o caminho
            if (atual == destino) {
                return montarCaminhoFinal(quemMeTrouxeAqui, inicio, destino);
            }

            List<Integer> vizinhos = adjacencias.get(atual);
            
            if (vizinhos != null) {
                // Percorrendo a lista de vizinhos do jeito tradicional
                for (int i = 0; i < vizinhos.size(); i++) {
                    int vizinho = vizinhos.get(i);
                    
                    if (visitados.contains(vizinho) == false) {
                        visitados.add(vizinho);
                        // Guardamos: "Para chegar no 'vizinho', eu passei pelo 'atual'"
                        quemMeTrouxeAqui.put(vizinho, atual);
                        fila.add(vizinho);
                    }
                }
            }
        }
        return null; // Não encontrou caminho
    }

    private List<Integer> montarCaminhoFinal(Map<Integer, Integer> historico, int inicio, int destino) {
        // LinkedList permite usar o addFirst para não precisar inverter a lista depois
        LinkedList<Integer> caminho = new LinkedList<>();
        
        // Começamos de trás para frente (do destino para o início)
        Integer passoAtual = destino;

        while (passoAtual != null) {
            // addFirst coloca o número sempre na primeira posição da lista
            caminho.addFirst(passoAtual);
            
            if (passoAtual == inicio) {
                break;
            }
            
            // Pega o vértice que nos levou até o passoAtual
            passoAtual = historico.get(passoAtual);
        }
        
        return caminho;
    }

    public static void main(String[] args) {
        GrafoBFS meuGrafo = new GrafoBFS();
        
        // Exemplo: Criando conexões entre cidades ou computadores
        meuGrafo.adicionarConexao(1, 2);
        meuGrafo.adicionarConexao(1, 3);
        meuGrafo.adicionarConexao(2, 4);
        meuGrafo.adicionarConexao(4, 6);

        System.out.println("Caminho encontrado: " + meuGrafo.encontrarCaminhoCurto(1, 6));
    }
}