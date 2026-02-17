package modules.three.lessons.BFS;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class BFS {
  private Map<String, List<Aresta>> adjacentes;

  public BFS() {
    adjacentes = new HashMap<>();
  }

  // método que faz busca por largura (BFS)
  public Map<String,Boolean> buscaPorLargura(String verticeInicial){
      //define os nós visitados e a fila
      Map<String, Boolean> visitados = new HashMap<>();
      Queue<String> fila = new LinkedList<>();

      //adiciona todos os vertices(nós) a lista de visitados como false
      for (String vertice : adjacentes.keySet()) {
          visitados.put(vertice, false);
      }

      //add o vertice inicial a fila e a visitados como true
      fila.add(verticeInicial);
      visitados.put(verticeInicial, true);

      //verifica se a fila contem algo 
      while (!fila.isEmpty()) {
          //pega o primeiro da fila e exibe
          String verticeAtual = fila.poll();
          System.out.print(verticeAtual + " ");

          //lista os vizinhos do vertice atual
          List<Aresta> vizinhos = adjacentes.get(verticeAtual);

          //testa cada um dos vizinhos
          for (Aresta aresta : vizinhos) {
              if (!visitados.get(aresta.getDestino())) {
                  fila.add(aresta.getDestino());
                  visitados.put(aresta.getDestino(), true);
              }
          }

      }

      return visitados;
  }

  // método para adicionar um novo nó(vertice) ao grafo
  public void adicionarVertice(String rotulo) {
    adjacentes.put(rotulo, new ArrayList<>());
  }

  // método para adicionar uma nova aresta(arco, ligação etc..)
  public void adicionarAresta(String origem, String destino, int peso) {
    if(adjacentes.containsKey(origem)) adicionarVertice(origem);
    if(adjacentes.containsKey(destino)) adicionarVertice(destino);

    adjacentes.get(origem).add(new Aresta(destino, peso));
  }

  // imprime o grafo completo
  public void imprimirGrafo() {
    for(String vertice : adjacentes.keySet()) {
      List<Aresta> arestas = adjacentes.get(vertice);

      System.out.print((vertice + " "));
      for(Aresta aresta : arestas) {
        System.out.print(aresta.getDestino() + "(" + aresta.getPeso() + ") ");
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    BFS grafo = new BFS();

    // adicionando paises no grafo
    grafo.adicionarVertice("Brasil");
    grafo.adicionarVertice("México");
    grafo.adicionarVertice("Alemanha");
    grafo.adicionarVertice("Portugal");
    grafo.adicionarVertice("Inglaterra");

    // adicionando conexoes de paises
    grafo.adicionarAresta("Brasil", "Japão", 5);
    grafo.adicionarAresta("Alemanha", "Portugal", 3);
    grafo.adicionarAresta("Portugal", "Alemanha", 5);
    grafo.adicionarAresta("Brasil", "México", 7);
    grafo.adicionarAresta("Inglaterra", "México", 2);
    grafo.adicionarAresta("Brasil", "Inglaterra", 5);
    
    grafo.buscaPorLargura("Brasil");
    grafo.buscaPorLargura("Portugal");
  }

  private class Aresta {
    private String destino;
    private int peso;

    public Aresta(String destino, int peso) {
      this.destino = destino;
      this.peso = peso;
    }

    public String getDestino() {
      return destino;
    }

    public int getPeso() {
      return peso;
    }
  }
}
