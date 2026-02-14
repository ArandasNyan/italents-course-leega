package modules.two.exercises.maps;

import java.util.HashMap;
import java.util.Map;

// 9 - Mesclar Mapas:
// Implemente um método para mesclar dois HashMaps e manipular possíveis conflitos de chaves.

public class MesclarMapas {

  public static void main(String[] args) {
      //Estoque da Loja A
      Map<String, Integer> estoqueLojaA = new HashMap<>();
      estoqueLojaA.put("Teclado", 10);
      estoqueLojaA.put("Mouse", 20);
      estoqueLojaA.put("Monitor", 5);

      //Estoque da Loja B
      Map<String, Integer> estoqueLojaB = new HashMap<>();
      estoqueLojaB.put("Mouse", 15);     // Forçamos um conflito, pois o item já existe na Loja A
      estoqueLojaB.put("Monitor", 2);   // Conflito! Já existe na Loja A
      estoqueLojaB.put("Headset", 12);  // Não há conflitos

      System.out.println("Estoque A: " + estoqueLojaA);
      System.out.println("Estoque B: " + estoqueLojaB);

      // Mesclando os mapas
      mesclarEstoques(estoqueLojaA, estoqueLojaB);

      System.out.println("\nEstoque Total (Após Mesclagem): " + estoqueLojaA);
  }

  public static void mesclarEstoques(Map<String, Integer> mapaPrincipal, Map<String, Integer> mapaSecundario) {
      // Percorremos o segundo mapa para os ajustes
      mapaSecundario.forEach((chave, valor) -> 
          // Utilizo o método merge para lidar com os conflitos v1 e v2
          // Se a chave não existir, ele adiciona
          // Se existir, ele executa a função (v1, v2) -> v1 + v2
          mapaPrincipal.merge(chave, valor, (valorAntigo, valorNovo) -> {
              System.out.println("⚠️ Conflito na chave [" + chave + "]: Somando " + valorAntigo + " + " + valorNovo);
              return valorAntigo + valorNovo; // Aqui decidimos SOMAR os valores
          })
      );
  }
}